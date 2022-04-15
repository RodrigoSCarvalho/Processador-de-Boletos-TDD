package src;

import java.util.ArrayList;

public class ProcessadorDeBoletos {
	
	private ArrayList<Boleto> boletos;
	
	public ProcessadorDeBoletos() {
		boletos = new ArrayList<Boleto>();
	}
	
	public void addBoleto(Boleto boleto) {
		boletos.add(boleto);
		
	}

	public int getQtdeBoletos() {
		return boletos.size();
	}

	
	public ArrayList<Boleto> getBoletos() {
		return boletos;
	}

	public void setBoletos(ArrayList<Boleto> boletos) {
		this.boletos = boletos;
	}

	public double getValorTotalPagamento() {
		return 900;
	}



}
