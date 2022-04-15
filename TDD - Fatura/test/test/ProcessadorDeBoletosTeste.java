package test;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import src.Boleto;

public class ProcessadorDeBoletosTeste {

	ArrayList boletos;
	Boleto boleto1;
	Boleto boleto2;
	Boleto boleto3;
	
	
	@Before
	public void inicializa() {
		this.boletos = new ArrayList();
	}
	
	@Test
	public void addBoleto() {
		this.boleto1 = new Boleto(0001, "21-03-2022", 500.00);
		Assertions.assertEquals(1, ProcessadorDeBoletos.getQtdeBoletos());
	}
	
}
