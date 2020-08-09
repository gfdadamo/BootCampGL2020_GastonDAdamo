import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Hombre implements Persona,Animal {

	@Override
	public void sonidoAnimal() {
		
		System.out.println("El hombre no hace sonidos de animal");
		
	}
	
	
	
	@Override
	public void hablar() {
		
		System.out.println("Las personas hablan mucho");
		
	}
	
	
	@Override
	public void Dormir() {
		
		System.out.println("El hombre duerme muchas hs");
		
	}
	
	
	@Override
	public void come( final String s) {
		
		System.out.println("Se ejecuta metodo de la clase "+ s);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
     Hombre ho = new Hombre();
     
     ho.Dormir();
     ho.hablar();
     ho.sonidoAnimal();
     ho.come("Hombre");
		
	}



	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

}
