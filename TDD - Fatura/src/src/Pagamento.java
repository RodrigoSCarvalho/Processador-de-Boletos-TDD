package src;

public class Pagamento {

	private String data;
	private double 	valorPago;
	private String tipoPagamento;
	
	
	public Pagamento(String data, double valor, String tipo) {
		this.data = data;
		this.tipoPagamento = tipo;
		this.valorPago = valor;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public double getValorPago() {
		return valorPago;
	}


	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}


	public String getTipoPagamento() {
		return tipoPagamento;
	}


	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

}
