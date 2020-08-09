
public class ExcepcionArray {

	int[] num = {0,1,2,3,4,5};
	
	
	int getValor(int indice) {
		
		return num[indice];
		
		
	}
	
	
	public static void main(String[] args) {
		ExcepcionArray ea = new ExcepcionArray();
		
		try {
			
			ea.getValor(6);
			System.out.println("Valor:"+ea.getValor(5));
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Excepcion indice de array fuera de los limites"+e.getMessage());
			
		}

	}

}
