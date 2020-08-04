
public class Cafetera extends Electrodomestico {
	
	private double litros;
	
	@Override
	public void encender() {
		
		System.out.println("Encendiendo Cafetera");
		
	}
	
	public void elegirSabor(String sabor) {
		
		System.out.println("Sabor elegido"+sabor);
		
	}

}
