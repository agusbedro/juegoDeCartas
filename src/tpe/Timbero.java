package tpe;

import java.util.ArrayList;

public class Timbero implements Estrategia {
	
	public String elegirAtributo(Carta carta) {
		ArrayList<String> atributos = carta.getNombreAtributos();
		
		int atributoRandom = (int) (Math.random()* (atributos.size()-1));
		String nombre = atributos.get(atributoRandom);
		
		return nombre;
	}
}
