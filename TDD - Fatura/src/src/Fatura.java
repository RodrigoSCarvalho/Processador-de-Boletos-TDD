package src;

import java.util.ArrayList;

public class Fatura {
	 
    private String data;
    private String nomeCliente;
    private double valorFatura;
    ArrayList<Boleto> boletos;
    
    public double getValorFatura(){
        return valorFatura;
    }
    
    public void setValorFatura(double valorFatura){
        this.valorFatura = valorFatura;
    }
    
        public String getData(){
        return data;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
        public String getNomeCliente(){
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

	public ArrayList<Boleto> getBoletos() {
		return boletos;
	}

	public void setBoletos(ArrayList<Boleto> boletos) {
		this.boletos = boletos;
	}
    
}
