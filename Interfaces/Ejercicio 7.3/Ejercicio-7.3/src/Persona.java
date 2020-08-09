
public interface Persona {
	
	public void hablar();
	
	public void dormir();
		
	default void come(String s) {
		
		System.out.println("Las "+s+ "se alimentan");
		
		
	}

}
