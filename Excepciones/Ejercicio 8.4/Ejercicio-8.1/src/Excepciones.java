
public class Excepciones {

	public static void main(String[] args) {
		
		try {
			
			throw new Exception("Esto es una excepcion");
			
		} catch (Exception e) {
			
			System.out.println("Se ha producido una excepcion"+e.getMessage());
			
		}
		
		finally {
			
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
			
		}

	}

}
