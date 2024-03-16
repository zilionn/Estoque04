package view;

import model.Produto;

public class ValidarProduto {

	public static void main(String[] args) {
		Produto product = new Produto();
		
		product.setNome("Celular");
		product.setPreco(1800);
		product.setQtdEstoque(10);
		
		boolean disponibilidade = product.verificaProdutoDisponivel("Celular");
		float valorEstoque = product.totalValorEstoque();
		
		System.out.println("PRODUTO: " + product.getNome());
		System.out.println("PREÇO: " + product.getPreco());
		System.out.println("QUANTIDADE EM ESTOQUE: " + product.getQtdEstoque());
		System.out.println("DISPONIBILIDADE: " + disponibilidade);
		System.out.println("VALOR EM ESTOQUE: " + valorEstoque);
		
		

	}

}
