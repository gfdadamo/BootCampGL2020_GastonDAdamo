
public class Televisor extends Electrodomestico {

	private double pulgadas;
	private  String resolucion;
	
	
@Override	
public void encender() {
		
		System.out.println("Encendiendo Televisor");
		
	}


public void cambiarCanal(int canal ) {
	
	System.out.println("Cambiando al scanal"+canal);
	
}
	
}
