import java.awt.List;
import java.util.ArrayList;

public class PrimeraLista {

	public static void main(String[] args) {
		
		ArrayList<String>letters = new ArrayList<>();
		
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		System.out.println(letters);
		
		System.out.println(letters.size()); 
		
		letters.add(1,"X");
		System.out.println(letters);
	}

}
