package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {

	static void enviar(String para, String assunto, String texto) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("vhfcs2005", "v8!!2005"));
		email.setSSLOnConnect(true);
		email.setFrom("vhfcs2005@gmail.com");
		email.setSubject(assunto);
		email.setMsg(texto);
		email.addTo(para);
		email.send();
	}
	
}
