import java.util.*;

public class exc_5_8 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double xinicial, xfinal, salto;
		
		do {
			System.out.print("Introduza o valor inicial de x: ");
			xinicial = sc.nextDouble();
		
			System.out.print("Introduza o valor final de x: ");
			xfinal = sc.nextDouble();
			
			System.out.print("Introduza o salto entre os cada valor: ");
			salto = sc.nextDouble();
		} while (xinicial >= xfinal);
	}
}

