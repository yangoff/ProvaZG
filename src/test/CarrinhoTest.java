package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Carrinho;
import model.Sku_produto;

public class CarrinhoTest {

	@Test
	public void testAddSku() {
		System.out.println("Adicionar Sku");
		
		Carrinho c =  new Carrinho();
		Sku_produto a = new Sku_produto("a", 50f);
		c.addSku(a);
		c.checkout();
		
	}

	@Test
	public void testCheckout() {
		System.out.println("Testar o Checkout");
	}

}


//@Test
//public void testUpdate() throws Exception {
//  System.out.println("Update");
//  Exemplar exemplar = new Exemplar(3, 1, Boolean.FALSE, "heyeyhaAA", "2");
//  ExemplarDAO instance = new ExemplarDAO();
//  instance.Update(exemplar);
//  Exemplar resul = instance.Pesquisar(exemplar);
//  assertEquals(exemplar.getLiberadoParaEmprestimo(), resul.getLiberadoParaEmprestimo());
//  
//
//}