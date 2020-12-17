package tpe;

import java.util.ArrayList;

public class Carta {

	private ArrayList <Atributo> atributos;
	private String personaje;
	private Pocima pocima;
	
	public Carta(String personaje) {
		this.personaje = personaje;
		atributos = new ArrayList <Atributo>();
	}

	public ArrayList<String> getNombreAtributos() {
		ArrayList<String> nombres = new ArrayList<String>();
		
		for(Atributo atributo: atributos) {
			nombres.add(atributo.getNombre());
		}
		
		return nombres;
	}
	
	public Pocima getPocima() {
		return pocima;
	}

	public void setPocima(Pocima pocima) {
		this.pocima = pocima;
	}

	public String getPersonaje() {
		return personaje;
	}

	public void addAtributo(Atributo aa) {
		atributos.add(aa);
	}
	
	public void removeAtributo(Atributo aa) {
		atributos.remove(aa);
	}
	
	public Atributo getAtributo(String nombre) {
		for(int i = 0; i < atributos.size(); i++) {
			if(atributos.get(i).getNombre().equals(nombre)) 
				return atributos.get(i);
			}
				return null;
	}
	
	public boolean tieneAtributo(String nombre){
        Atributo aa = this.getAtributo(nombre);
        if(aa!=null) {
        	return true;
        }
        else {
        	return false;
        }
    }
	
	public int cantidadAtributos() {
		return atributos.size();
	}
	
	public double valorDelAtributo(String nombreAtributo) {
		for (Atributo atributo : atributos) {
			if (atributo.getNombre().equals(nombreAtributo)) {
				return atributo.getValor();
			}
		}
		return -1;
	}
	
	public Atributo obtenerAtributoPorIndice(int indice) {
		return atributos.get(indice);
	}
	
	@Override
	public boolean equals(Object obj) {
		Carta otraCarta = (Carta) obj;
		int cantAtributos = 0;
		for (Atributo atributo : atributos) {
			if (otraCarta.atributos.contains(atributo))
				cantAtributos++;
		}
		return otraCarta.personaje.equals(personaje) && atributos.size()==otraCarta.atributos.size() && cantAtributos == atributos.size();
	}
	
	public boolean mismosAtributos(Carta otraCarta) {
		int cantAtributos = 0;
		for (Atributo atributo : atributos) {
			if (otraCarta.atributos.contains(atributo))
				cantAtributos++;
		}
		return atributos.size()==otraCarta.atributos.size() && cantAtributos == atributos.size();
	}
	
	public void aplicarPocimaACarta(Pocima pocima) {
		this.setPocima(pocima);
		for(Atributo atributo: atributos) {
			atributo.aplicarPocima(pocima);
		}
	}
	
	public double obtenerValorFinal(String atributoElegido) {
		double valorCarta = this.valorDelAtributo(atributoElegido);
		
		if(this.getPocima()!=null) {
			valorCarta = this.getAtributo(atributoElegido).aplicarPocima(this.getPocima());
		}
		return valorCarta;
	}
}
