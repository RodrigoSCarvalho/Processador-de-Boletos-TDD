package src;

import java.util.ArrayList;

public class Fatura {
	 
    private String data;
    private String nomeCliente;
    private double valorFatura;
    private ArrayList<Boleto> boletos;
    
    
    public Fatura(String data, String nome, double valor) {
    	this.data = data;
    	this.nomeCliente = nome;
    	this.valorFatura = valor;
    	boletos = new ArrayList<Boleto>();
    }    
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

	public void addBoleto (Boleto boleto) {
		boletos.add(boleto);
	}
    
	public ArrayList<Boleto> getBoletos() {
		return boletos;
	}

	public void setBoletos(ArrayList<Boleto> boletos) {
		this.boletos = boletos;
	}

}
