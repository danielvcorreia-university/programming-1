/*
 * exc_5_5.java
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

public class exc_5_4 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int num, i;
		
		do {
			System.out.print("Insira o número ente (1 e 10): ");
			num = ler.nextInt();
		}while (num < 1 || num > 10);
		
		for (i = num; i > 0 ; i--) {
			System.out.printf("%d! = %d\n",i, fatorial(i));
		}
	}
	
	public static int fatorial (int y) {
		int fator = 1;
		for (int i = y; i > 0; i--) {
			fator = fator * i;
		}
		return fator;
	}
} 


