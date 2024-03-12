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

public class exc_5_5 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int largura, altura;
		
		System.out.print("Largura: ");
		largura = ler.nextInt();
		System.out.print("Altura: ");
		altura = ler.nextInt();
		
		printRectangle(largura, altura);
	}
	
	public static void printRectangle(int largura, int altura) {
		for (int linha = 0; linha < altura; linha++) {
			for (int coluna = 0; coluna < largura; coluna++) {
				if (linha == 0 || coluna == 0 || linha == altura-1 || coluna == largura-1)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.print("\n");
		} 
	}
}

