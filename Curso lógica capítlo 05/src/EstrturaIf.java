
public class EstrturaIf {
	
	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		//Boolean movimentaPleoMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean ContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		//Boolean liberarEmprestimo = movimentaPleoMenosMetadeDoValor && ContaTemTempoSuficienteDeAbertura && temNomeLimpo; 
		
		if (! (((movimentacaoMedia * 2) >= emprestimo) 
				&& ContaTemTempoSuficienteDeAbertura && temNomeLimpo)) {
			System.out.println("Sim! Pode liberar o empr�stimo.");
			
		} else {
			System.out.println("N�o, n�o pode liberar o empr�stimo do banco.");
			
		}
	}


}











