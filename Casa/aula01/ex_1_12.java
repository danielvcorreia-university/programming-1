/*
 * ex_1_12.java
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

public class ex_1_12 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int tempoi, segundos, minutos, horas, tempof;
		int i = 0, ii = 0, iii = 0;
		
		System.out.print("Tempo em segundos: ");
		tempoi = ler.nextInt();
		
		horas = (tempoi / (60 * 60));

		i = (tempoi % (60 * 60));
		
		minutos = (i / 60);

		ii = (i % 60);
		
		segundos = ii;
		
		
		System.out.printf("%d hora : %d minuto : %d segundos", horas, minutos, segundos);
		
	}
}

