package primeiraclasse;

public class exercicio01Parte2 {

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.nome = "PS4";
		produto.quantidadeEstoque = 8;

		System.out.println(
				"Necess�rio repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));
	}

	static Boolean eNecessarioReporEstoque(Produto produto) {
		if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}

		return false;
	}

}
