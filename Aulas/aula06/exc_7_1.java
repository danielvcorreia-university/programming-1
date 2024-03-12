import java.io.*;
import java.util.Scanner;

public class exc_7_1 {
	
	public static void main (String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		String a;
		
		System.out.print("Introduza o nome do ficheiro ou diretório: ");
		a = sc.nextLine();
		
		File fin = new File(a); // "C:/users/danielvalacorreia/abc.txt"
		                                // "/homermt/danielvalacorreia/abc.txt"
		
		if (!fin.exists()) {
			System.out.println ("o ficheiro não existe! ");
			return;	
		}
	
		else if (!fin.isFile()) {
			System.out.println("Não é um ficheiro! ");
			return;
		}
		
		else if (!fin.canRead()) {
			System.out.println("Não tem permissão de leitura ");
			return;
		}
		
		Scanner scf = new Scanner(fin);
		while (scf.hasNextLine()) {
			String s = scf.nextLine();
			System.out.println(s);
			cont++;
		}
		
		System.out.println("O ficheiro tem " + cont + " linhas");
		scf.close();
	}
}

