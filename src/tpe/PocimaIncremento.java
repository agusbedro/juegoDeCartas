package tpe;

public class PocimaIncremento extends Pocima {

	private double valorAplicado;
	
	public PocimaIncremento(String nombrePocima, double valorAplicado) {
		super(nombrePocima);
		this.valorAplicado = valorAplicado;
	}
	
	@Override
	public double aplicarPocima(Atributo atributo) {
		Atributo aux = new Atributo(atributo.getNombre(), atributo.getValor());
		aux.setValor(atributo.getValor()+(atributo.getValor()*valorAplicado));
		return aux.getValor();
	}
	
	public void setValorAplicado(double valor) {
		valorAplicado = valor;
	}
	
}

