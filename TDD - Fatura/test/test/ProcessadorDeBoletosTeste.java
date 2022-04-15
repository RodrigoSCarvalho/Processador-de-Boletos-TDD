package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import src.Boleto;
import src.Fatura;
import src.Pagamento;
import src.ProcessadorDeBoletos;

public class ProcessadorDeBoletosTeste {

	Boleto boleto1;
	Boleto boleto2;
	Boleto boleto3;
	Pagamento pagamentoBoleto1;
	Pagamento pagamentoBoleto2;
	Pagamento pagamentoBoleto3;
	Fatura fatura;
	ProcessadorDeBoletos proc;
	
	
	@Before
	public void inicializa() {
		this.proc = new ProcessadorDeBoletos();
		this.boleto1 = new Boleto(0001, "21-03-2022", 500.00);
		this.boleto2 = new Boleto(0002, "21-03-2022", 400.00) ;
		this.fatura = new Fatura("24-03-2022", "Eduardo Gudin", 1500.00);
		this.pagamentoBoleto1 = new Pagamento("21-03-2022", 500.00, "BOLETO");
		this.proc.addBoleto(this.boleto1);
	}
	
	@Test
	public void testAddPagamento(){
		proc.addPagamento(pagamentoBoleto2);
		assertEquals("2", proc.getQtdePagamentos());
	}
	
	@Test
	public void testAddBoleto() {
		proc.addBoleto(boleto2);
		Assertions.assertEquals(2, proc.getQtdeBoletos());
	}
	
	
	@Test
	public void testQuantidadeBoletos() {
		Assertions.assertEquals(1, proc.getQtdeBoletos());
	}
	
	@Test
	public void testPagamentoFatura() {
		
	}
}
