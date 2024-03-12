/*
 * exercicio_5_3.java
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
import java.util.Scanner;

public class excercicio_5_3 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		System.out.print("NÚMERO DE DIAS DE UM MES\n");
		
		int mes, ano;
		int msg ;

			System.out.print("Insira o valor do mes: ");
			mes = getIntPos(1,12);
		
			System.out.print("Insira o valor do ano: ");
			mes = getIntPos(0,9999);
		
	}
	
	public static boolean bissexto (int ano) {
		
		if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public static int getIntPos (int min, int max) { 
		int validacao;
		
		do {
			validacao = sc.nextInt();
			
			if (validacao < min || validacao > max) {
				System.out.print("O valor inválido!\n");
			}
			
		} while (validacao < min || validacao > max);
		
		return validacao;
	}
}

