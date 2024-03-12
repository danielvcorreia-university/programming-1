/*
 * exc_5_7.java
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

public class exc_5_7 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MAIOR DIVISOR COMUM");
		
		int numero1, numero2;
		
		System.out.print("Insira o primeiro número: ");
		numero1 = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		numero2 = sc.nextInt();
		
		System.out.printf("O maior divisor comum é :%d\n", maiorDivisorComum(numero1, numero2));
	}
	
	public static int maiorDivisorComum (int numero1, int numero2) {
		
		int resto1, resto2;
		
		if (numero1 >= numero2) {
			
			if (numero1 % numero2 == 0) {
				return numero2;
			}
			else {
				resto1 = numero1 % numero2;
				
				do {
					resto2 = numero2 % resto1;
					if (resto2 == 0) {
						return resto1;
					}
					numero2 = resto1;
					resto1 = resto2;
				} while (true);
			}
		}
		else {
			if (numero2 % numero1 == 0) {
				return numero1;
			}
			else {
				resto1 = numero2 % numero1;
				
				do {
					resto2 = numero1 % resto1;
					if (resto2 == 0) {
						return resto1;
					}
					numero2 = resto1;
					resto1 = resto2;
				} while (true);
			}
		}
	}
}
	

