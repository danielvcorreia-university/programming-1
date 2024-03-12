/*
 * ex_3_4.java
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

public class ex_3_4 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int n ,cont = 0;
		int secret = (int)(100.0*Math.random()) +1;
		
		do {
			System.out.print("Tente adivinhar num número inteiro entre 1 e 100: ");
			n = ler.nextInt();
			cont++;
			if (n > secret)
				System.out.println("O número introduzido é maior! ");
			else if (n < secret)
				System.out.println("O número introduzido é menor! ");
		}while (n != secret);
		
		System.out.printf("Número de tentativas: %d", cont);
	}
}

