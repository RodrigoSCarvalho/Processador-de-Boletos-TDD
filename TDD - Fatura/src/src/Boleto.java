package src;

public class Boleto {
	
    private int codigo;
    private String data;
    private double valorPago;
    private Pagamento pagamento;
    
    public Boleto(int codigo, String data, double valor) {
    	this.codigo = codigo;
    	this.data = data;
    	this.valorPago = valor;
    	this.pagamento = new Pagamento(data, valor, "BOLETO");
    }
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
    
	

}
