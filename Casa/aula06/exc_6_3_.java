import java.util.*;

public class exc_6_3_ {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		int escolher, maximo = 0, minimo = 0, a[] = new int[50];
		double media = 0;
		boolean par;
		
		do {
			escolher = menu();
			
			switch (escolher) {
				case 1: lerSequencia(a);
					break;
				case 2: escreverSequencia(a);
					break;
				case 3: maximo = maximoSequencia(a);
					System.out.printf("O máximo da sequência é %d.", maximo);
					System.out.println("");
					break;
				case 4: minimo = minimoSequencia(a);
					System.out.printf("O mínimo da sequência é %d.", minimo);
					System.out.println("");
					break;
				case 5: media = mediaSequencia(a);
					System.out.printf("A média da sequência é %f.", media);
					System.out.println("");
					break;
				case 6: par = paridadeSequencia(a);
					if (par) {
						System.out.print("É uma sequência de números par.");
					}
					
					else {
						System.out.print("É uma sequência de números ímpar.");
					}
					System.out.println("");
					break;
				case 10: System.out.print("See you soon :)\n");	
					break;
			}
			
			System.out.print("");
		} while (escolher != 10);
	}
	
	public static int menu() {
		int escolher;
		
		System.out.println("");
		System.out.println("Análise de uma sequência de números inteiros");
		System.out.println("1 - Ler a sequência");
		System.out.println("2 - Escrever a sequência");
		System.out.println("3 - Calcular o máximo da sequência");
		System.out.println("4 - Calcular o mínimo da sequência");
		System.out.println("5 - Calcular a média da sequência");
		System.out.println("6 - Detetar se é uma sequência só constituída por números pares");
		System.out.println("10 - Terminar o programa");
		
			do {
				System.out.print("Opção ->");
				escolher = sc.nextInt();
			
				if (escolher == 10) {
					break;
				}
		} while (escolher < 1 || escolher > 6 );
		System.out.println("");
		return escolher;
	}
	
	public static void lerSequencia(int a[]) {
		for (int i = 0; i < a.length; i++) {
			do {
				System.out.printf("Número %d: \n", i+1);
				a[i] = sc.nextInt();
				
				if (a[i] == 0) {
					return;
				}
				
			} while (a[i] < 0);
		}
	}
	
	public static void escreverSequencia(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				return;
			}
			
			System.out.printf("%d\n", a[i]);
		}
	}
	
	public static int maximoSequencia(int a[]) {
		int maximo = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maximo){
				maximo = a[i];
			}
			
			else if (a[i] == 0) {
				return maximo;
			}
		}
		return maximo;
	}
	
	public static int minimoSequencia(int a[]) {
		int minimo = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				return minimo;
			}
			
			else if (a[i] < minimo) {
				minimo = a[i];
			}
		}
		return minimo;
	}
	
	public static double mediaSequencia(int a[]) {
		double media = 0;
		int soma = 0, cont = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				cont++;
				soma = soma + a[i];
			}
			
			else {
			}
		}
		
		media = (double)((double)soma / (double)cont);
		
		return media;
	}
	
	public static boolean paridadeSequencia(int a[]) {
		boolean par;
		int soma = 0, resultado = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				soma = soma + a[i];
			}
		}
		
		resultado = soma % 2;
		
		if (resultado == 0) {
			return true;
		}
		
		else {
			return false;
		}
	}
}



