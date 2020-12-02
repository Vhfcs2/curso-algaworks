import java.util.Scanner;

public class exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		String[] tarefas = new String[5];
		tarefas[0] = "Limpar o quarto";
		tarefas[1] = "Lavar a louça";
		tarefas[2] = "Alimentar o cachorro";
		tarefas[3] = "Jogar o lixo fora";
		tarefas[4] = "Arrumar a cama";
		
		for(int i =0; i < tarefas.length; i++) {
			System.out.println(tarefas[i]);
		
	
		scanner.close();
	
	
	}

}

}