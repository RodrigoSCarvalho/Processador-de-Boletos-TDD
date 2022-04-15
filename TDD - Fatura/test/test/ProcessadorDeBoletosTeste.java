package test;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import src.Boleto;
import src.ProcessadorDeBoletos;

public class ProcessadorDeBoletosTeste {

	Boleto boleto1;
	Boleto boleto2;
	Boleto boleto3;
	ProcessadorDeBoletos proc;
	
	
	@Before
	public void inicializa() {
		this.proc = new ProcessadorDeBoletos();
		
	}
	
	@Test
	public void testAddBoleto() {
		this.boleto1 = new Boleto(0001, "21-03-2022", 500.00);
		proc.addBoleto(boleto1);
		Assertions.assertEquals(1, proc.getQtdeBoletos());
	}
	
	
	@Test
	public void testQuantidadeBoletos() {
		Assertions.assertEquals(1, proc.getQtdeBoletos());
	}
}
