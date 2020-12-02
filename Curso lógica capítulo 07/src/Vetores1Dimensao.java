import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
//		String[] cardapio = new String[] { "Calabresa" , "Bacon", "Mussarela", "Pepperoni" }; 
//		
//		System.out.println("Escolha o sabor da sua pizza:");
//		
//		for(int i =0; i < cardapio.length; i++) {
//			System.out.println("[" + i + "]" + cardapio[i]);
//		}
//	
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Digite o número referente ao sabor");
//		Integer saborEscolhido = scanner.nextInt();
//		
//		System.out.println("Você escolheu o sabor: " + cardapio[saborEscolhido] );
//		
//		scanner.close();
		
//		String[] cardapio = new String[] { "Calabresa" , "Bacon", "Mussarela", "Pepperoni" }; 
//		
//		cardapio[3] = "Portuguesa";
//		for(int i =0; i < cardapio.length; i++) {
//		System.out.println( cardapio[i]);
//	
//	}
		
		String[] cardapio = new String[4];
		cardapio[0] = "Calabresa";
		cardapio[1] = "Bacon";
		cardapio[2] = "Mussarela";
		cardapio[3] = "Pepperoni";
		
		for(int i =0; i < cardapio.length; i++) {
			System.out.println(cardapio[i]);
		}
	}

	
	
}
