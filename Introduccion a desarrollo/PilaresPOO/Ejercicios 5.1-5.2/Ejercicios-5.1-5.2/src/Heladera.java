
public class Heladera extends Electrodomestico {
	
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;

	@Override
public void encender() {
		
		System.out.println("Encendiendo Heladera");
		
	}
	
	
	public void guardarElemento(String elemento) {
		
		System.out.println("Guardando" +elemento+ "de la heladera");
		
	}
	

public void extraerElemento(String elemento) {
		
		System.out.println("Extrayendo"+elemento+"de la heladera");
		
	}
	
	
}
