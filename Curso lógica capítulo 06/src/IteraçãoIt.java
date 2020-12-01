
public class IteraçãoIt {

	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Kageyama Baka.");
//		}
	
//		int i = 0;
//		while (i < 10) {
//			if (i == 5) {
//				System.out.println("vai parar!");
//				break;
//				
//			}
//			System.out.println("Kageyama Baka.");
//			i++;
//		}		
		int i = 0;
		while (i < 10) {
			if (i == 5) {
				System.out.println("vai continuar...");
				i++;
				continue;
				
			}
			
			System.out.println(i + ": Kageyama Baka.");
			i++;
		
	}

}

}