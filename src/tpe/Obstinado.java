package tpe;

import java.util.ArrayList;

public class Obstinado implements Estrategia {
	
	private String atributo;
	
	public Obstinado(String atributo) {
		this.atributo = atributo;
	}
	
	public String elegirAtributo(Carta carta) {
		ArrayList<String> atributos = carta.getNombreAtributos();
		
		for(String nombre: atributos) {
			if(nombre.equals(this.atributo)) {
				return atributo;
			}
		}
		
		return null;
	}
}
