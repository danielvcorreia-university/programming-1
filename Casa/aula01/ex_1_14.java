/*
 * ex_1_14.java
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

public class ex_1_14 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double A, B, hipotenusa, angulo;
		System.out.print("Valor do primeiro cateto (A): ");
		A = ler.nextDouble();
		System.out.print("Valor do segundo cateto (B): ");
		B = ler.nextDouble();
		
		hipotenusa = Math.sqrt((A * A) + (B * B));
		System.out.printf("A hipotenusa (C) é %f \n", hipotenusa);
		
		angulo = (Math.asin(A / hipotenusa)) * (180 / 3.1415);
		System.out.printf("O Ângulo entre o cateto A e a hipotenusa C é de %fºGraus", angulo);
	}
}

