package tpe;

import java.util.ArrayList;

public class Ambicioso implements Estrategia {
	
	public String elegirAtributo(Carta carta) {
		ArrayList<String> atributos = carta.getNombreAtributos();
		double grande = 0;
		String mayor = null;
		
		for(String nombre: atributos) {
			double valor = carta.getAtributo(nombre).getValor();
			if(valor>grande) {
				grande = valor;
				mayor = nombre;
			}
		}
		return mayor;
	}
}