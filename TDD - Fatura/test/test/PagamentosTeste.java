package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentosTeste {

	Pagamento pagamento;
	
	@Before
	public void inicializa() {
		this.pagamento = new Pagamento("21-03-2022", 500, "BOLETO");
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
