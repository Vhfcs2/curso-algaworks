
public class operadoresl�gicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromo��o = true;
		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromo��o;
		
		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromo��o;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto. ");
			
		} else {
			System.out.println("N�o aplique o desconto. ");
			
		}
		
	}

}
