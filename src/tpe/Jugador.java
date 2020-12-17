package tpe;

public class Jugador {

	private String nombre;
	private double puntos;
	private Mazo cartas;
	private Estrategia estrategiaJuego;
	
	public Jugador(String nombre, Estrategia estrategiaJuego) {
		this.nombre = nombre; 
		puntos = 0;
		cartas = new Mazo();
		this.estrategiaJuego = estrategiaJuego;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPuntos() {
		return puntos;
	}
	
	public Estrategia getEstrategia() {
		return estrategiaJuego;
	}
	
	public void setEstrategia(Estrategia estrategia) {
		estrategiaJuego = estrategia;
	}
	
	public Mazo getCartas(){
		return cartas;
	}
	
	public Carta elegirCarta() {
		if(this.cartas!=null) {
			return this.cartas.getCarta();
		}
		return null;
	}
	
	public void addCarta(Carta carta) {
		cartas.addCarta(carta);
	}
	
	public String aplicarEstrategia() {
		return estrategiaJuego.elegirAtributo(this.elegirCarta());
	}
	
	public void ganador(Carta cc) {
		cartas.addCarta(cc);
		cartas.mandarPrimerCartaAlFinal();
	}
	
	public void perdedor(Carta cc) {
		cartas.removeCarta(cc);
	}
	
	public int getCartasSize() {
		return this.cartas.cantidadCartas();
	}

}