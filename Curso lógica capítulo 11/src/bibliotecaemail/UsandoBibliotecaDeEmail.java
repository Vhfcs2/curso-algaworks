package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		
		Carteiro.enviar("hugof.victor@gmail.com", "Aula sobre uso de biblioteca de terceiros", "Se voc� estiver vendo esse email, � porque funcionou :-)");
		
		System.out.println("Fim...");

	}

}
