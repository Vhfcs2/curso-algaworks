
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
			
		//----------------------------------------------------------------
		// exerc�cio
			
			Boolean contribuiu25Anos = true;
			Boolean temMaisDe55Anos = true;
			
			Boolean podeAposentar = contribuiu25Anos || temMaisDe55Anos;
			
			if (podeAposentar) {
				System.out.println("Sim, pode se aposentar");
			
			} else {
				System.out.println("N�o, n�o pode se aposentar");
			}
		
		
	}

}
