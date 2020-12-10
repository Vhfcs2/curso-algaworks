package leituraDeArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class leituraArquivos {

	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:/Usuários/Victor/meu-arquivo.txt");
		List<String> linhas1 = Files.readAllLines(arquivo);
		
		for(int i = 0; i < linhas1.size(); i++) {
			String nome = linhas1.get(i);
			
			System.out.println("Jogador " + i + ": " + nome);
		}
	}
	
}
