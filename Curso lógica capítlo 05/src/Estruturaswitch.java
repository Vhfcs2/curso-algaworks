import java.util.Scanner;

public class Estruturaswitch {

	public  static  void  main ( String [] args ) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o m�s: ");
		Integer mes = scanner.nextInt();
		
		Double desconto = 0.0;
		
		switch(mes) {
		case 1: desconto = 0.0;
		case 2: desconto = 0.0;
		case 3: desconto = 15.0;
		case 4: desconto = 30.0;
		case 5: desconto = 10.0;
		case 6: desconto = 10.0;
		case 7: desconto = 10.0;
		case 8: desconto = 10.0;
		case 9: desconto = 10.0;
		case 10: desconto = 20.0;
		case 11: desconto = 10.0;
		case 12: desconto = 0.0;
		
		scanner.close();
	
	}
