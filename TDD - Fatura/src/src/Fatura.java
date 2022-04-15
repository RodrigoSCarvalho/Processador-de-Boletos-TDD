package src;

import java.util.ArrayList;
import java.util.Iterator;

public class Fatura {
	 
    private String data;
    private String nomeCliente;
    private double valorFatura;
    private ArrayList boletos;
    
    
    public Fatura() {
    	boletos = new ArrayList();
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
    
	public ArrayList getBoletos() {
		return boletos;
	}

	public void setBoletos(ArrayList boletos) {
		this.boletos = boletos;
	}

}
