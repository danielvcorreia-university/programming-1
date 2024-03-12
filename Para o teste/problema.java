//problema 1 folhas de exercícios 12

import java.util.*;
import java.io.*;

public class problema {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) throws IOException {
		Dia array[] = new Dia[31];
		
		array = lerFicheiro();
		
	}
	
	public static Dia[] lerFicheiro () throws IOException {
		String nomeFicheiro;
		File ficheiro;
		Dia[] array = new Dia[31];
		do { 
			do {
				nomeFicheiro = sc.nextLine();
			} while (nomeFicheiro.length() == 0);
			
			
			ficheiro = new File(nomeFicheiro);
		}while (!ficheiro.canRead() || !ficheiro.isFile());
	
		Scanner scf = new Scanner(ficheiro);
		
		for (int i = 0; i < 31; i++) {
			
			if (scf.hasNextInt()) {
				int t = scf.nextInt();
				int h = scf.nextInt();
				array[i] = new Dia(t,h);
			}else break;
		}
		return array;
	}
}

class Dia {
	int t;
	int h;
	
	Dia(int t1, int h1) {
		t = t1;
		h = h1;
	}
}

