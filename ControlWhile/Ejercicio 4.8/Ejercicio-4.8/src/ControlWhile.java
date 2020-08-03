
public class ControlWhile {

	public static void main(String[] args) {
		
		int numero=1;
		
		
		while(numero<=50) {
			
			if (numero % 2== 0) {
				
				System.out.println("El valor iterado:"+numero+"Par");
				
			}
			
			else {
				
				System.out.println("El valor iterado:"+numero+"Impar");
				
			}
			
			numero++;
			
		}
		
		
	}

}
