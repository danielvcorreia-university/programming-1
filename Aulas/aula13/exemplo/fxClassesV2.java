/* Este programa lê um ficheiro de texto com o nº mecanográfico e o
   nome dos alunos de uma turma, pede ao utilizador para introduzir a
   nota correspondente e grava o resultado noutro ficheiro de texto.
   
   Versão 2: uso de exclusivo de métodos estáticos
   
   (validações foram omitidas)
*/
import java.util.*;
import java.io.*;
public class fxClassesV2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) throws IOException {
		Aluno [] alunos = new Aluno [20];
		int nAlunos = 0;

		nAlunos = lerFicheiro(alunos, "turma.txt");
		lerNotas(alunos, nAlunos);
		gravarNotas(alunos, nAlunos, "notas.txt");
	}
	
	static int lerFicheiro(Aluno [] a, String nomeFx) throws IOException{
		int n = 0;
		File fin = new File(nomeFx);
		Scanner scf = new Scanner(fin);
		while(scf.hasNextLine()) {
			a[n] = new Aluno();
			a[n].nmec = scf.nextInt();
			a[n].nome = scf.nextLine().trim();
			n++;
		}
		scf.close();
		return n;
	}
	
	static void lerNotas(Aluno [] a, int n) {
		for(int i=0; i<n; i++) {
			System.out.print("Nota (" + a[i].toString() + "): ");
			a[i].nota = sc.nextInt();
		}
	}
	
	static void gravarNotas(Aluno [] a, int n, String nomeFx) throws IOException {
		File fout = new File(nomeFx);
		PrintWriter pw = new PrintWriter(fout);
		for(int i=0; i<n; i++) {
			String r = 	a[i].nmec + ", " + a[i].nome;
			if (a[i].nota >= 0)
				r += ", " + a[i].nota;
			pw.println(r);
		}
		pw.close();
	}
}

class Aluno {
	int nmec, nota;
	String nome;
}
