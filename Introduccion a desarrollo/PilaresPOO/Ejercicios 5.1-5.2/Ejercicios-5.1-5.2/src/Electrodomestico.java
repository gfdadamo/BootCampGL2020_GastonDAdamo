import java.awt.List;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Electrodomestico {
	
	
	private String marca;
	private double peso;
	private char consumo;
	private String color;
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void encender() {
		
		System.out.println("Encendiendo Electrodomestico");
		
	}
	
	public void apagar() {
		
		System.out.println("Apagando Electrodomestico");
		
	}
	
	private static void herencia() {
		
		final Electrodomestico elec = new Electrodomestico();
		final Heladera hel = new Heladera();
		
		elec.setMarca("Generica 1");
		elec.setColor("Blanco");
		
		hel.setMarca("Generica 2");
		hel.setColor("Gris");
		
		System.out.println("Electrodomestico-Marca:"+elec.getMarca()+"Color:"+elec.getColor());
		System.out.println("Heladera-Marca:"+hel.getMarca()+"Color:"+hel.getColor());
		
		elec.encender();
		hel.encender();
	}
	
	private static void polimorfismo() {
		
	final Heladera hel	= new Heladera();
	final Cafetera cafe = new Cafetera();
	final Televisor tele= new Televisor();
	
	
	 ArrayList<Electrodomestico> elec = new ArrayList<Electrodomestico>();
	
	elec.add(hel);
	elec.add(cafe);
	elec.add(tele);
	
	for (Electrodomestico e : elec) {
		
		e.encender();
	}
	
	
		
	}
	

}
