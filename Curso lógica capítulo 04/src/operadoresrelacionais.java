
public class operadoresrelacionais {

	public static void main(String[] args) {
		//==: igual
		//&&: "e"
		//||: "ou"
		//!=: "diferente"
		
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2? " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2? " + tresMenorQueDois);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		Boolean tresMenorOuIgualATres = 3 <= 3;
		System.out.println("3 <= 3? " + tresMenorOuIgualATres);
		
		Boolean doisIgualADois = 2 == 2;
		System.out.println("2 = 2? " + doisIgualADois );
		
		Boolean doisDiferenteDeADois = 2 != 2;
		System.out.println("2 != 2? " + doisDiferenteDeADois);
		
		Integer quatro = 4;
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("quatro > quatro? " + quatroMaiorQueQuatro);
		
		//Equals
		Integer cinco = 5;
		Boolean cincoIgualACinco = cinco.equals(cinco);
		System.out.println("cinco.equals(cinco)" + cincoIgualACinco);
		
		
	
		
	} 
	
}
 