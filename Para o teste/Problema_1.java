import java.util.*;
import java.io.*;

public class Problema_1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		
		do {
			menu();
		} while (true);
	}
	
	public static void menu () {
		int escolher;
		
		System.out.print("Estação meteorológica:");
		System.out.println("1 - Ler ficheiro de dados");
		System.out.println("2 - Acrescentar medida");
		System.out.println("3 - Listar valores de temperatura e humidade");
		System.out.println("4 - Listar medidas ordenadas por valor de temperatura");
		System.out.println("5 - Listar medidas ordenadas por valor de humidade");
		System.out.println("6 - Calcular valores médios de temperatura e humidade");
		System.out.println("7 - Calcular valores máximos e mínimos de temperatura e humidade");
		System.out.println("8 - Calcular histograma das temperaturas e humidade");
		System.out.println("9 - Terminar o programa\n");
		
		do {	
			System.out.print("Opção -> ");
			escolher = sc.nextInt();
			
		} while (escolher < 1 || escolher > 9);
		
	}
}

