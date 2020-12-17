package tpe;

public abstract class Pocima {
	
	private String nombrePocima;
	
	public Pocima(String nombrePocima) {
		this.nombrePocima = nombrePocima;
	}
	
	public abstract double aplicarPocima (Atributo atributo);
	
	public String toString() {
		return this.nombrePocima;
	}
		
	
}
