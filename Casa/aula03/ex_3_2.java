/*
 * ex_3_2.java
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
import java.util.Scanner;

public class ex_3_2 {
	
	public static void main (String args[]) {
		double n, nf = 1;
		Scanner ler = new Scanner(System.in);
		while(true){
			do {
			System.out.print("Introduza uma lista de números (terminada com 0): ");
			n = ler.nextDouble();
			if (n != 0)
				nf = n * nf;		
		}while (n != 0);
		
		if (n == 0) { 
			System.out.printf("O produto entre os números introduzidos é de %f\n", nf);	
			nf = 1;
		}		
	}}
}

