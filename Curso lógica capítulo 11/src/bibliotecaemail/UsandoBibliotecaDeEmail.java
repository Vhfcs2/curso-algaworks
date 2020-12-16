package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		
		Carteiro.enviar("hugof.victor@gmail.com", "Aula sobre uso de biblioteca de terceiros", "Se você estiver vendo esse email, é porque funcionou :-)");
		
		System.out.println("Fim...");

	}

}
