
public class exercício01 {

	public static void main(String[] args) {
		Double valorTotal = 200.0;
		Double movimentacaoMedia = 150.0;
		
		Boolean movimentaPleoMenosMetadeDoValor = (movimentacaoMedia * 2) >= valorTotal;
		Boolean passouNoConcurso = true;
		Boolean estaNaMedia = true;
		
		if ( ((movimentacaoMedia * 2) >= valorTotal) 
				&& passouNoConcurso && estaNaMedia) {
			System.out.println("Sim! passou no concurso.");
			
		} else {
			System.out.println("Não, não passou no concurso.");
			
		}
	}


}
	

