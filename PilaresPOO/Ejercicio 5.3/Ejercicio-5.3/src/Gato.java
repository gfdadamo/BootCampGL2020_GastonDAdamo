
public class Gato {
	
	private String nombre;
	private int patas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int numeroPatas) {
		patas = numeroPatas;
	}
	
	
  public static void main(String[] args) {
		
		Gato gato = new Gato();
	    gato.setNombre("Nemo");
	    gato.setPatas(4);
		
	  System.out.println("Mi gato se llama:" + gato.getNombre());
	  System.out.println("El numero de patas de mi gato es:" + gato.getPatas());
}
	

}
