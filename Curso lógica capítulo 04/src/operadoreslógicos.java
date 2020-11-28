
public class operadoreslógicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromoção = true;
		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromoção;
		
		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromoção;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto. ");
			
		} else {
			System.out.println("Não aplique o desconto. ");
			
		}
		
	}

}
