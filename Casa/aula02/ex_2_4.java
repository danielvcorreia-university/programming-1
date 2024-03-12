/*
 * ex_2_4.java
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

public class ex_2_4 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int mes, ano, i;
		
		System.out.print("Mês: ");
		mes = ler.nextInt();
		System.out.print("Ano: ");
		ano = ler.nextInt();
					
			switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("O mes tem 31 dias");
				break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("O mes tem 30 dias");
				break;
				case 2:
					if (ano % 4 != 0) {
					System.out.println("O mes tem 28 dias");
					}
					else if (ano % 100 != 0) {
					System.out.println("O mes tem 29 dias");
					}
					else if (ano % 400 != 0) {
					System.out.println("O mes tem 28 dias");
					}
					else
					System.out.println("O mes tem 29 dias");
				break;
				default:
					System.out.println("mes inválido");
				break;
			}
			
		
	}
}

