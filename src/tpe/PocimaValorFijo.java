package tpe;

public class PocimaValorFijo extends Pocima {

	private double valorAplicado;
	
	public PocimaValorFijo(String nombrePocima, double valorAplicado) {
		super(nombrePocima);
		this.valorAplicado = valorAplicado;
	}
	
	@Override
	public double aplicarPocima(Atributo atributo) {
		Atributo aux = new Atributo(atributo.getNombre(), atributo.getValor());
		aux.setValor(valorAplicado);
		return aux.getValor();
	}

}
