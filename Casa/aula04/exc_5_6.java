/*
 * exc_5_6.java
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

public class exc_5_6 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		do {
			int numero;
		
			do {
				System.out.print("(entre 0 e 100) Tabuada do: ");
				numero = ler.nextInt();
			} while (numero <= 0 || numero >= 100);
			
			System.out.println("-----------------------");
			System.out.printf("|    Tabuada dos %2d   |\n", numero);
			System.out.print("-----------------------\n");
			
			for (int umADez = 1; umADez <= 10; umADez++) {
				System.out.printf("|  %2d x %2d   |   %3d  |\n", numero, umADez, tabuada(numero,umADez));
			}
			
			System.out.println("-----------------------\n");
			
		} while (true);
		
	}
	
	public static int tabuada (int numero, int umADez) {
		int conta;
		
			conta = numero * umADez;
		return conta;
	}
}

