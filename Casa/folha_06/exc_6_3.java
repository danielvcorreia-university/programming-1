import java.util.*;
import java.io.*;

public class exc_6_3 {
	static Scanner sc = new Scanner(System.in);
	static int a[] = new int[50];
	
	public static void main (String[] args) {
		
		int chose;
		
		do {
			do {
				menu();
				chose = sc.nextInt();
				System.out.println("");
			} while (chose < 1 || chose > 6 && chose != 10);
			
				switch (chose) {
					case 1:
						readSequence();
					break;
					case 2:
						writeSequence();
					break;
					case 3:
						System.out.printf("O valer máximo da sequência é: %d\n", maxSequence());
						
						System.out.println("");
					break;
					case 4:
						System.out.printf("O valer mínimo da sequência é: %d\n", minSequence());
						
						System.out.println("");
					break;
					case 5:
					System.out.printf("A média da sequência é: %f\n", mediaSequence());
						
					System.out.println("");
					break;
					case 6:
						if (parSequence() == true) {
							System.out.println("A sequência tem apenas números pares!");
						}
						else {
							System.out.println("Não é par!");
						}
					break;
					case 7:
						parSequence()
						break;
					default: break;
				}		
			} while (chose != 10);
	}
	
	static void menu() {
		System.out.println("Análise de uma sequência de números inteiros");
		System.out.println("1 - Ler a sequência");
		System.out.println("2 - Escrever a sequência");
		System.out.println("3 - Calcular o máximo da sequência");
		System.out.println("4 - Calcular o mínimo da sequência");
		System.out.println("5 - Calcular a média da sequência");
		System.out.println("6 - Detetar se é uma sequência só constituída por números pares");
		System.out.println("10 - Terminar o programa");
		System.out.print("Opção --> ");
	}
	
	static void readSequence() {
		int i;
		
		System.out.println("Sequência acaba no fim de 50 números ou com a introdução do númeoro 0");
		
		for (i = 0; i < 50; i++) {
			do {
				System.out.printf("Número %d: ", i+1);
				a[i] = sc.nextInt();
			} while (a[i] < 0);
			
			System.out.println("");
			
			if (a[i] == 0) {
				break;
			}
		}
	}
	
	static void writeSequence() {
		int i;
		
		for (i = 0; i < 50; i++) {
			if (a[i] == 0) {
				break;
			}
			
			System.out.printf("%d\n", a[i]);
		}
		
		System.out.println("");
	}
	
	static int maxSequence() {
		int i, valorMax = 0;
		
		for (i = 0; i < 50; i++) {
			if (a[i] == 0) {
				break;
			}
			
			if (valorMax <= a[i]) {
				valorMax = a[i];
			}
		}
		 
		return valorMax;
	}
	
	static int minSequence() {
		int i, valorMin = a[0];
		
		for (i = 0; i < 50; i++) {
			if (a[i] == 0) {
				break;
			}
			
			if (valorMin >= a[i]) {
				valorMin = a[i];
			}
		}
		 
		return valorMin;
	}
	
	static double mediaSequence() {
		double media = 0;
		int soma = 0, i, ii;
		
		for (i = 0; i < 50; i++) {
			if (a[i] == 0) {
				break;
			}
			
			soma = soma + a[i];
			
			for (i = 0; i < 50; i++) {
				if (a[i] == 0) {
					break;
				}
			
				media = soma / i;
			}
		}
		
		return media;
	}
	
	static boolean parSequence() {
		int i, cont = 0;
		boolean validacao;
		
		for (i = 0; i < 50; i++) {
			if (a[i] == 0) {
				break;
			}
			
			else if (a[i] % 2 == 0) {
				cont++;
			}
		}
		
		if (cont == a[i-1]) {
			return true;
		}	
		
		else return false;
	}
}
