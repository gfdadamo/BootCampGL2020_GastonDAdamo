
public class Excepciones {
	
 String s="Ejercicio de Excepcion Null";
 String getString() {
	 
	 return s;
	 
 }
	
	
	public static void main(String[] args) {
		
		
		Excepciones en = null;
		
		try {
			
			en.getString();
			
		} catch (Exception e) {

         System.out.println("Se produjo una excepcion:"+e.getMessage());
			
		}

	}

	
}
