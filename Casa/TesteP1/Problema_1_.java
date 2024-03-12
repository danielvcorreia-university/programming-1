import java.util.*;
import java.io.*;

public class Problema_1_ {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) throws IOException {
		int escolher = 0;
		Dia array[] = new Dia[31];
		
		do {
			escolher = menu(escolher);
			
			switch (escolher) {
				case 1: array = LerFicheiro();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
			}
		} while (escolher != 9);
	}
	
	public static int menu(int escolher) {
		
		System.out.print("Estação meteorológica:\n");
		System.out.print("	1 - Ler ficheiro de dados\n");
		System.out.print("	2 - Acrescentar medida\n");
		System.out.print("	3 - Listar valores de temperatura e humidade\n");
		System.out.print("	4 - Listar medidas ordenadas por valor de temperatura\n");
		System.out.print("	5 - Listar medidas ordenadas por valor de humidade\n");
		System.out.print("	6 - Calcular valores médios de temperatura e humidade\n");
		System.out.print("	7 - Calcular valores máximos e mínimos de temperatura e humidade\n");
		System.out.print("	8 - Calcular histograma das temperaturas e humidade\n");
		System.out.print("	9 - Terminar o programa\n");
		
		do {
			System.out.print("    Opção ->");
			escolher = sc.nextInt();
		} while (escolher < 1 || escolher > 9);
		
		System.out.println("");
		
		return escolher;
	}
	
	public static Dia[] LerFicheiro() throws IOException {
		String nameIn;
		File fin;
		Dia array[] = new Dia[31];
		int temperatura, humidade, cont = 0;
		
		do{
			do{
				System.out.print("Nome do ficheiro: ");
				nameIn = sc.nextLine();
			}while(nameIn.length() == 0);
			
			fin = new File(nameIn);
		}while(!fin.canRead() && !fin.isFile());
		
		Scanner scf = new Scanner(fin);

		for (int i = 0; i < 31; i++){
			temperatura = 0;
			humidade = 0;
			if (scf.hasNextInt()) {
				temperatura = scf.nextInt();
				humidade = scf.nextInt();
				array[i] = new Dia(temperatura, humidade);
				cont++;
			}
		}
		
		Dia[] arraySimplificado = new Dia[cont];
		for (int i = 0; i < cont; i++) {
			arraySimplificado[i] = array[i];
		}
		
		return arraySimplificado;
	}
}

class Dia {
	int temperatura;
	int humidade;
	
	Dia (int temperatura_in, int humidade_in) {
		temperatura = temperatura_in;
		humidade = humidade_in;
	}
}
