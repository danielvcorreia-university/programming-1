/*
 * ex_4_2.java
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

public class ex_4_2 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int N, i;
		do {
			System.out.print("Introduza um número inteiro entre 0 e 100: ");
			N = ler.nextInt();	
			System.out.println("-------------------------");
			System.out.printf("|     Tabuada dos %d     |\n",N);
			System.out.println("-------------------------");
		}while (N < 0 || N > 100);
		
		for (i = 1; i <= 10; i++) {
			System.out.printf("|    %3d * %2d = %4d     |\n", N, i, i*N); 
		}
		System.out.println("-------------------------");
	}
}

