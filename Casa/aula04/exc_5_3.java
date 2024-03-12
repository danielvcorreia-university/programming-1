/*
 * exc_5_3.java
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

public class exc_5_3 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int ano, mes;
		do {
			System.out.print("Insira um mês (1 a 12): ");
			mes = ler.nextInt();
		} while (mes < 1 || mes > 12);
		do {
			System.out.print("Insira o ano desse mês: ");
			ano = ler.nextInt();
		} while (ano < 0);
		
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("O mês tem 31 dias! ");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("O mês tem 30 dias! ");
				break;
			case 2:
				if (anoBisexto(ano) == true) {
					System.out.print("O mês tem 29 dias! ");
				}
				else {
					System.out.print("O mês tem 28 dias! ");
				}
			break;
		}
	}
	
	public static boolean anoBisexto(int ano) {
		if (ano % 4 != 0) {
				return false;
			}
			else if (ano % 100 != 0) {
				return true;
			}
			else if (ano % 400 != 0) {
				return false;
			}
			else
				return true;
	}
}

