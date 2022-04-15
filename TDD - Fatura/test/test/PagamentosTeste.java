package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import src.Pagamento;

public class PagamentosTeste {

	Pagamento pagamento;
	
	@Before
	public void inicializa() {
		this.pagamento = new Pagamento("21-03-2022", 500.00, "BOLETO");
	}
	
	@Test
	public void testAddPagamento() {
		Assertions.assertEquals("21-03-2022", pagamento.getData());
	}
		
	
	@Test 
	public void testValorPago() {
		assertEquals(500, pagamento.getValorPago());
	}
	
}
