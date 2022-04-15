package src;

import java.util.ArrayList;

public class ProcessadorDeBoletos {
	
	private ArrayList<Boleto> boletos;
	
	public void ProcessadorDeBoleto() {
		boletos = new ArrayList<Boleto>();
	}

	public int getQtdeBoletos() {
		return boletos.size();
	}

	public void addBoleto(Boleto boleto) {
		boletos.add(boleto);
		
	}

}
