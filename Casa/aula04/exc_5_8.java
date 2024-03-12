import java.util.*;

public class exc_5_8 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		double xinicial, xfinal, salto, x;
		
		do {
			System.out.print("Introduza o valor inicial de x: ");
			xinicial = sc.nextDouble();
		
			System.out.print("Introduza o valor final de x: ");
			xfinal = sc.nextDouble();
			
			System.out.print("Introduza o salto entre os cada valor: ");
			salto = sc.nextDouble();
			
			if (xinicial >= xfinal) {
					System.out.println("VALORES INVÁLIDOS!");
			}
			
		} while (xinicial >= xfinal);
		
		System.out.print("---------------------------------\n");
		System.out.print("|  x| 5x2+10x+3 | 7x3+3x2+5x+2  |\n");
		System.out.print("---------------------------------\n");
		
		for (x = xinicial; x < xfinal; x = x + salto) {
			
			System.out.printf("| %4.1f | %8.2f | %11.3f |\n", x, polinomioGrau2(x), polinomioGrau3(x));
			System.out.print("-------------------------------\n");
		}
		
		System.out.printf("| %4.1f | %8.2f | %11.3f |\n", xfinal, polinomioGrau2(xfinal), polinomioGrau3(xfinal));
		System.out.print("---------------------------------\n");
	}
	
	public static double polinomioGrau2 (double numero) {
		
		double polinomio;
		
		polinomio = 5 * Math.pow(numero,2) + 10 * numero + 3;
		
		return polinomio;
	}
	
	public static double polinomioGrau3 (double numero) {
		
		double polinomio;
		
		polinomio = 7 * Math.pow(numero,3) + 3 * Math.pow(numero,2) + 5 * numero + 2;
		
		return polinomio;
	}
}

