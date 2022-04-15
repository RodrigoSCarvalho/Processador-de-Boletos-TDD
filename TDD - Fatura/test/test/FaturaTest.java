package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import junit.framework.Assert;
import src.Boleto;
import src.Fatura;

public class FaturaTest {
	
	Fatura fatura;
	Boleto boleto1;
	Boleto boleto2;
	Boleto boleto3;
	
	
	@Before
	public void inicializa() {
		this.fatura = new Fatura();
	}
	
	@Test
	public void Fatura() {
		assertEquals("PAGA", this.fatura.getFaturaPaga());
	}
	

}
