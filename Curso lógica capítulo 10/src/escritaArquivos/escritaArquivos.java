package escritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class escritaArquivos {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> linhas = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.print("Jogador " + i + ": ");
			String nome = scanner.nextLine();

			linhas.add(nome);
		}
		
		
		
		ArrayList<String> linhas1 = new ArrayList<String>();
		String[] linhas2 = new String[] { "1", "2,", "3" };
		
		linhas1.add("Linha um");
		
		Path arquivo = Paths.get("C:/Usuários/Victor/meu-arquivo.txt");
		Files.write(arquivo, linhas1);
		
		scanner.close();
		
		System.out.println("Fim...");

	}

}
