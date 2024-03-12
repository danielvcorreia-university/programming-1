/*
 * ex_3_1.java
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

public class ex_3_1 {
	
	public static void main (String args[]) {
		int n, cont = 0;
		do {
			Scanner ler = new Scanner(System.in);
		System.out.print("Introduza um número negativo: ");
		n = ler.nextInt();
		cont++;
		}
		while (n >= 0);
		if (n < 0) {
		System.out.printf("Foram introduzidos %d números até introduzir um negativo. ", cont);	
		}
	}
}

