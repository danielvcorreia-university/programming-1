/*
 * ex_2_5.java
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

public class ex_2_5 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int P1x, P2x, P3x, P4x, P1y, P2y, P3y, P4y;
		int v1x, v1y, v2x, v2y, v3x, v3y, v4x, v4y;
		int produtoescalar1, produtoescalar2;
		//coordenadas introduzidas pelo utilizador
		System.out.print("Introduza as coordenadas do ponto P1 (x,y): ");
		P1x = ler.nextInt();
		P1y = ler.nextInt();
		System.out.print("Introduza as coordenadas do ponto P2 (x,y): ");
		P2x = ler.nextInt();
		P2y = ler.nextInt();
		System.out.print("Introduza as coordenadas do ponto P3 (x,y): ");
		P3x = ler.nextInt();
		P3y = ler.nextInt();
		System.out.print("Introduza as coordenadas do ponto P4 (x,y): ");
		P4x = ler.nextInt();
		P4y = ler.nextInt();
		//vetores formados pelos pontos
		v1x = P1x - P2x;
		v1y = P1y - P2y;
		v2x = P3x - P2x;
		v2y = P3x - P2y;
		v3x = P1x - P4x;
		v3y = P1y - P4y;
		v4x = P3x - P4x;
		v4y = P3y - P4y;
		// produto escalar dos vetores
		produtoescalar1 = v1x * v2x + v1y * v2y;
		produtoescalar2 = v3x * v4x + v3y * v4y;
		
		if ( produtoescalar1 == 0 && produtoescalar2 == 0) {
		System.out.println("Os pontos introduzidos formam um quadrado! ");
		}
		else {
		System.out.println("Os pontos introduzidos não formam um quadrado.");
		}
	}
}

