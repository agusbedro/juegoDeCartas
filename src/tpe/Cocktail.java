package tpe;

import java.util.ArrayList;

public class Cocktail extends Pocima {

	private ArrayList<Pocima> pocimas;
	
	public Cocktail(String nombrePocima) {
		super(nombrePocima);
		pocimas = new ArrayList<Pocima>();
	}
	
	public void addPocima(Pocima pocima) {
		pocimas.add(pocima);
	}
	
	//devolver valor y no atributo 
	@Override
	public double aplicarPocima(Atributo atributo) {
		double valor = atributo.getValor();
		Atributo aux = new Atributo("aux", atributo.getValor());
		for(Pocima pocima: pocimas) {
			valor += pocima.aplicarPocima(aux);
			aux.setValor(valor);
		}
		
		return aux.getValor();
	}

}
