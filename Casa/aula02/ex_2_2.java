/*
 * ex_2_2.java
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

public class ex_2_2 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double a, b;
		System.out.print("Insira o primeiro número real: ");
		a = ler.nextDouble();
		System.out.print("Insira o segundo número real: ");
		b = ler.nextDouble();
		
		if (a > b){
			System.out.printf("O número real %f é maior que %f\n", a, b);
		}
		else if (a < b){
			System.out.printf("O número real %f é maior que %f\n", b, a);
		}
		else if (a == b){
			System.out.printf("O número real %f é igual a %f\n", a, b);
		}
	}
}

