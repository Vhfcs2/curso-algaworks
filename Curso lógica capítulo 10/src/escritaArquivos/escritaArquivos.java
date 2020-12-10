package escritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class escritaArquivos {

	public static void main(String[] args) throws IOException {
		ArrayList<String> linhas = new ArrayList<String>();
		String[] linhas2 = new String[] { "1", "2,", "3" };
		
		linhas.add("Linha um");
		
		Path arquivo = Paths.get("C:/Usuários/Victor/meu-arquivo.txt");
		Files.write(arquivo, linhas);
		
		System.out.println("Fim...");

	}

}
