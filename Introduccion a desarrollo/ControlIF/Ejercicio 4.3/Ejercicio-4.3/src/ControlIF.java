
public class ControlIF {

	public static void main(String[] args) {
	
		double compra=400;
		double descuento;
		double total;
		
		if (compra == 300) {
			
			descuento = compra * 0.20;
			total= compra - descuento;
			
			System.out.println("El descuento es de:" +descuento);
			System.out.println("El total a pagar es de:" +total);
			
		}
		
		
		else if (compra >= 350) {
			
			descuento = compra * 0.25;
			total= compra - descuento;
			
			System.out.println("El descuento es de:" +descuento);
			System.out.println("El total a pagar es de:" +total);
			
		}
		
		else{
			 
		    total=compra;	
		   System.out.println("Sin descuentos, el total es:"+total );
			
		}
		

	}

}
