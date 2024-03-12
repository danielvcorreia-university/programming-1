import java.util.*;
import java.io.*;

public class exc_6_5 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		int numbers;
		double a[], media, soma = 0;
		
		do {
			System.out.print("Quantos valores vai inserir? ");
			numbers = sc.nextInt();
		} while (numbers < 0);
		
		a = new double[numbers];
		
		//----------Guardar os valores das notas-------//
		for (int i = 0; i < numbers; i++) {
			do {
				System.out.printf("Nota número %d: ", i+1);
				a[i] = sc.nextDouble();
			} while (a[i] < 0 || a[i] > 20);
		}
		
		//----------Media dos valores inseridos-------//	
		for (int i = 0; i < numbers; i++) {
			soma = soma + a[i];
		}
		
		media = soma/numbers;
		
		//----------Imprimir os valores superiores à média-------//	
		for (int i = 0; i < numbers; i++) {
			if (a[i] > media) {
				System.out.printf("A nota número %d é superior à média (%f)!\n", i+1, media);
			}
		}
	}
}

