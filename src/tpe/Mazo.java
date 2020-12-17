package tpe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
	private ArrayList<Carta> mazo;

	public Mazo() {
		mazo = new ArrayList<Carta>();
	}
	
	public Mazo(int cantidad) {
		mazo = new ArrayList<>();
	}
	
	public boolean contieneCarta(Carta carta) {
		return this.mazo.contains(carta);
	}

	public void addCarta(Carta carta) {
		if (mazo.isEmpty() || mismosAtributos(carta)) {
			mazo.add(carta);
		}
	}
	
	public void removeCarta(Carta cc) {
		mazo.remove(cc);
	}

	public int cantidadCartas() {
		return mazo.size();
	}

	public boolean mismosAtributos(Carta carta) {
		return (!(mazo.isEmpty()) && mazo.get(0).mismosAtributos(carta));
		
	}
	
	public List<Carta> dameNCartas(int cantidad){
		List<Carta> cartasJugador = new ArrayList<>();
		for (int i=0; i<cantidad; i++) { 
			Carta cartaActual = mazo.get(0);
			mazo.remove(0);
			cartasJugador.add(cartaActual);
		}
		return cartasJugador;
	}
	
	public Carta getCarta() {
		Carta c = mazo.get(0);	
		return c;
	}
	
	public void mezclar() {
		Collections.shuffle(mazo);
	}

	public Carta getCartaPorIndice(int indice) {
		return mazo.get(indice);
	}
	
	public void mandarPrimerCartaAlFinal() {
		Carta primerCarta = mazo.get(0);
		removeCarta(primerCarta);
		mazo.add(primerCarta);
	}
	
}