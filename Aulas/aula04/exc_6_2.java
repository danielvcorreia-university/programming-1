/*
 * exc_6_1.java
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

public class exc_6_2 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int num = 0, n, cont = 0, i = 0;
		int [] a = new int[100];
		
		System.out.print("Qual é o número que quer encontrar? ");
		n = ler.nextInt();
		
		do {
			System.out.printf("Introduza o %d valor: ", cont+1);
			a[cont] = ler.nextInt();
			
				if(a[cont] == n) {
					num = num + 1;
				}
			cont++;
		} while (a[cont-1] >= 0 && cont < 100);
		
		System.out.printf("O número %d apareceu %d vezes! ", n, num);	
		}
	}


