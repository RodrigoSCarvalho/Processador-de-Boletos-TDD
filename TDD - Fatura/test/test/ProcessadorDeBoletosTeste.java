package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import src.Boleto;
import src.Fatura;
import src.ProcessadorDeBoletos;

public class ProcessadorDeBoletosTeste {

	Boleto boleto1;
	Boleto boleto2;
	Boleto boleto3;
	Fatura fatura;
	ProcessadorDeBoletos proc;
	
	
	@Before
	public void inicializa() {
		this.proc = new ProcessadorDeBoletos();
		this.boleto1 = new Boleto(0001, "21-03-2022", 500.00);
		this.boleto2 = new Boleto(0002, "21-03-2022", 400.00);
		this.boleto3 = new Boleto(0003, "22-03-2022", 600.00);
		this.fatura = new Fatura("24-03-2022", "Eduardo Gudin", 1500.00);
		this.proc.setFatura(this.fatura);
		this.proc.addBoleto(this.boleto1);
		this.proc.addBoleto(this.boleto2);
		this.proc.addBoleto(this.boleto3);
	}
	
	
	@Test
	public void testQuantidadeBoletos() {
		Assertions.assertEquals(3, proc.getQtdeBoletos());
	}
	
	@Test
	public void testValorPagoBoletos() {
		Assertions.assertEquals(1500, proc.getValorTotalPagamento());
	}
	
	@Test
	public void testFaturaPaga() {
		Assertions.assertEquals("PAGA", proc.verificaFaturaPaga());
	}
}
