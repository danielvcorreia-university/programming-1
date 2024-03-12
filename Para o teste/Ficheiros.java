import java.util.*;
import java.io.*;

public class Ficheiros {
	
	public static void main (String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ficheiro de entrada: ");
		String nameIn = sc.nextLine();
		
		File fin = new File(nameIn);
		Scanner scf = new Scanner(fin);
		
		String nameOut = sc.nextLine();
		File fout = new File(nameOut);
		PrintWriter pw = new PrintWriter(fout);
		
		while(scf.hasNextLine())
			pw.println(scf.nextLine());
		
		scf.close();
		pw.close();	
	}
}

