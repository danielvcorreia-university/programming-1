import java.util.*;
import java.io.*;

public class exc_7_1_ {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) throws IOException {
		int cont = 0;
		
		System.out.print("Qual o nome do ficheiro que quer ler: ");
		String nameIn = sc.nextLine();
		
		File fin = new File(nameIn);
		
		if (!fin.exists()) {
			System.out.println("O ficheiro "+ nameIn +" não existe!");
			return;
		}
		
		else if (!fin.isFile()) {
			System.out.println("O ficheiro "+ nameIn +" não é um ficheiro!");
			return;
		}
		
		else if (!fin.canRead()) {
			System.out.println("O ficheiro "+ nameIn +" não pode ser lido!");
			return;
		}
		
		Scanner scf = new Scanner(fin);
		while (scf.hasNextLine()) {
			String s = scf.nextLine();
			System.out.println(s);
			cont++;
		}
		System.out.println("");
		System.out.printf("O ficheiro "+ nameIn +" tem " + cont + " linhas. ");
	}
}

