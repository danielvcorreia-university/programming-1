/*
 * exc_6_3.java
 * 
 * Copyright 2017 danielvalacorreia <danielvalacorreia@danielvalacorreia-P50IJ>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.*;

public class exc_6_3 {
	
	static Scanner sc = new Scanner(System.in);
		
	public static void main (String args[]) {
		
		int [] a = new int[50];
		int cont = 0, escolher = 0;
		
		System.out.print("ANÁLISE DE UMA SEQUÊNCIA DE NÚMEROS INTEIROS\n");
		
		do {
			escolher = opcao();	
			
			switch (escolher) {
				case 1:
					System.out.print("Introduza uma sequência de números inteiros: \n");
					cont = ler(a);		

					break;
					
				case 2:
					System.out.print("Sequência dos números: \n");
					sequencia(a, cont);		

					break;
					
				case 3:
					System.out.printf("Máximo da sequência: %d", maximo(a, cont));	
					System.out.print("\n");
					
					break;
					
				 case 4:
					System.out.printf("Mínimo da sequência: %d", minimo(a, cont));	
					System.out.print("\n");
					
					break;
				default: 
					
			}
			 
		} while (escolher != 10);
		
	}
	static int opcao () {
		int escolher;
		
		do {
				System.out.print("1 - Ler a sequência\n");
				System.out.print("2 - Escrever a sequência\n");
				System.out.print("3 - Calcular o máximo da sequência\n");
				System.out.print("4 - Calcular o mínimo da sequência\n");
				System.out.print("5 - Calcular a média da sequência\n");
				System.out.print("6 - Detetar se é uma sequência só constituída por números pares\n");
				System.out.println("10 - Terminar o programa\n");
				System.out.print("Opção--> ");
				
				escolher = sc.nextInt();
				
			} while (escolher < 1 || escolher > 10 || escolher == 7 || escolher == 8 || escolher == 9);
			
			return escolher;
	}
	
	static int ler (int [] a) {
		int cont = 0;
		do {
				System.out.printf("%dº número: ", cont+1);
				a[cont] = sc.nextInt();
				cont++;
		} while (cont < 50 && a[cont-1] > 0);
		System.out.print("\n");
			return cont-1;
	}
	
	static void sequencia (int [] a, int cont) {
		
		for (int i = 0; i < cont; i++) {
			System.out.printf("%d\n", a[i]);
		}
		System.out.print("\n");
		
	}
	
	static int maximo (int [] a, int cont) {
		int numeromaximo = 0;
		
		for (int i = 0; i < cont; i++) {
			if (a[i] >= numeromaximo) {
				numeromaximo = a[i];
			}
		}
		return numeromaximo;	
	}
	
	static int minimo (int [] a, int cont) {
		int numerominimo = 0;
		
		for (int i = 0; i < cont; i++) {
			if (a[i] <= numerominimo) {
				numerominimo = a[i];
			}
		}
		return numerominimo;//ver o erro na função
	}
}

