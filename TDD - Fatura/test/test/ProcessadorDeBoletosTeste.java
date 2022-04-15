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
		this.boleto2 = new Boleto(0002, "22-03-2022", 400.00);
		this.fatura = new Fatura("24-03-2022", "Roberto Tadeu", 2000.00);
		this.proc.setFatura(this.fatura);
		this.proc.addBoleto(this.boleto1);
		this.proc.addBoleto(this.boleto2);
	}
	
	
	@Test
	public void testQuantidadePagamentosCriados() {
		Assertions.assertEquals(2, proc.getQtdePagamentos());
	}
	
	@Test
	public void testValorPagoBoletos() {
		Assertions.assertEquals(900, proc.getValorTotalPagamento());
	}
	
	@Test
	public void testFaturaPaga() {
		Assertions.assertEquals("NÃO PAGA", proc.verificaFaturaPaga());
	}
}
