
public abstract class AnimalImpl {

	public static void main(String[] args) {
		
		Perro dog = new Perro();
		
		dog.Dormir();
		dog.sonidoAnimal();
		
		dog.come("Perro");
		
		Animal.camina("Perro");

	}

}
