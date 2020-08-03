
public class ControlForEach {

	public static void main(String[] args) {
	
		String palabra = "BootCamp 2020";
		char[] letras= palabra.toCharArray(); 
		for (char l : letras) {
			
			System.out.println("Letra:"+l);
			
		}
	}

}
