package tpe;


public class PocimaSelectiva extends Pocima {

	private double incremento;
	private String nombre;
	
	public PocimaSelectiva(String nombrePocima, String nombre, double incremento) {
		super(nombrePocima);
		this.incremento = incremento;
		this.nombre = nombre;
	}
	
	public void setValorAplicado(double valor) {
		incremento = valor;
	}	

	@Override
	public double aplicarPocima(Atributo atributo) {
		Atributo aux = new Atributo(atributo.getNombre(), atributo.getValor());
		if(atributo.getNombre().equals(nombre)) {
			aux.setValor(atributo.getValor()+atributo.getValor()*incremento);
		}
		return aux.getValor();
	}
}
