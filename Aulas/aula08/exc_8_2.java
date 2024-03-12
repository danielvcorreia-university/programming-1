import java.util.Scanner;

public class exc_8_2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		Ponto2D maisAfastado = new Ponto2D();
		Ponto2D p = new Ponto2D();
		Ponto2D pp = new Ponto2D();
		
		lerPonto();
	}
	
	static void lerPonto () {
		Ponto2D ponto = new Ponto2D();
		
		do {	
				System.out.println("Introduza um ponto: ");
				System.out.print("Coordenada x: ");
				ponto.x = sc.nextDouble();
				System.out.print("Coordenada y: ");
				ponto.y = sc.nextDouble();
		} while (ponto.x != 0 || ponto.y != 0);
	}
	
	static void escreverPonto (Ponto2D maisAfastado) {
		
		System.out.printf("%.1f, %.1f", maisAfastado.x, maisAfastado.y);
	}
	
	static double distancePoints (Ponto2D p, Ponto2D pp) {
		double distance;
		
		distance = Math.sqrt(Math.pow((pp.x - p.x), 2) + Math.pow((pp.y - p.y), 2));
		
		return distance;
	}
}

class Ponto2D {
	double x, y;
}
