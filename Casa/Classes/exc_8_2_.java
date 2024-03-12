import java.util.*;
import java.io.*;

public class exc_8_2_ {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		double soma = 0;
		int cont = 0;
		Ponto2D ponto = new Ponto2D(0, 0);
		Ponto2D pontoMaisAfastado = new Ponto2D(0, 0);
		
		do {
			lerPonto(ponto);
			soma = soma + Distancia(ponto);
			pontoMaisAfastado(ponto, pontoMaisAfastado);
			cont++;
		} while (ponto.x != 0 || ponto.y != 0);
		
		System.out.printf("A soma das distâncias dos %d pontos à origem é %.1f\n", cont, soma);
		escreverPonto(pontoMaisAfastado);
		
		
		
	}
	
	public static void lerPonto(Ponto2D ponto) {
		System.out.print("Introduza um ponto:\n");
		System.out.print("Coordenada x: ");
		ponto.x = sc.nextInt();
		System.out.print("Coordenada y: ");
		ponto.y = sc.nextInt();
	}
	
	public static double Distancia(Ponto2D ponto) {
		double distancia = 0;
		
		distancia = (Math.sqrt(Math.pow(ponto.x,2) + Math.pow(ponto.y,2)));
		
		return distancia;
	}
	
	public static void escreverPonto(Ponto2D MaisAfastadoDaOrigem) {
		MaisAfastadoDaOrigem.x = (double)MaisAfastadoDaOrigem.x;
		MaisAfastadoDaOrigem.y = (double)MaisAfastadoDaOrigem.y;
		
		System.out.printf("O ponto mais afastado da origem foi: (%.1f, %.1f)", MaisAfastadoDaOrigem.x, MaisAfastadoDaOrigem.y);
	}
	
	public static void pontoMaisAfastado(Ponto2D ponto, Ponto2D pontoMaisAfastado) {
		if (Distancia(ponto) > Distancia(pontoMaisAfastado)) {
			pontoMaisAfastado(ponto.x, ponto.y);
		}
	}
}

class Ponto2D {
	double x;
	double y;
	
	Ponto2D(double x1, double y1) {
		x = x1;
		y = y1;
	}
}

