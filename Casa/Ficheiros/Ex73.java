import java.util.Scanner;
import java.io.*;
public class Ex73 {
	
	static Scanner ler = new Scanner (System.in);
	public static void main (String args[]) throws IOException{
		
		int option, dim=0;
		int new_elementos=0;
		int new_elementos2=0;
		int a[]= new int[50];
		int afile[]= new int[50];
		do {	
			do {
			System.out.print ("Análise de uma sequência de números inteiros\n");
			System.out.print (" 1 - Ler a sequência\n");
			System.out.print (" 2 - Escrever a sequência\n");
			System.out.print (" 3 - Calcular o máximo da sequência\n");
			System.out.print (" 4 - Calcular o mínimo da sequência\n");
			System.out.print (" 5 - Calcular a média da sequência\n");
			System.out.print (" 6 - Detetar se é uma sequência só constituída por números pares\n");
			System.out.print (" 7 - Ler uma sequência de números de um ficheiro de texto\n");
			System.out.print (" 8 - Adicionar números à sequência existente\n");
			System.out.print (" 9 - Gravar a sequência atual de número num ficheiro\n");
			System.out.print ("10 - Terminar o programa\n");
			System.out.print ("Opção -> ");
			option= ler.nextInt();
			ler.nextLine();
			System.out.print ("\n");	
			} while (option!=1 && option!=2 && option!=3 && option!=4 && option!=5 && option!=6 && option!=7 && option!=8 && option!=9 && option!=10);
		
			switch (option) {
				case 1: dim=0;
						dim= ler (a, dim);
					break;
				case 2: escrever (a, dim);
					break;
				case 3: max (a);
					break;
				case 4: min (a,dim);
					break;
				case 5: media (a,dim);
					break;
				case 6: pares (a,dim);
					break;
				case 7: 
						System.out.print("Ficheiro de Entrada: ");
						String nameIn= ler.nextLine();
						File fin= new File (nameIn);
						Scanner scf= new Scanner (fin);
						for (int i = 0; scf.hasNextInt(); i++){
							afile[i]= scf.nextInt();
							new_elementos++;
						}
						scf.close();
						System.out.println("Número de elementos lidos: "+new_elementos);
						System.out.print("\n");
					break;
				case 8: 
						for (int i = new_elementos; i < afile.length ; i++) {
							System.out.print("Insira um número: ");
							afile[i]= ler.nextInt();
							if (afile[i]==0) break;
							new_elementos2++;
						}
						System.out.println("Número de elementos adicionados: "+new_elementos2);
						System.out.print("\n");
					break;
				case 9:
						System.out.print("Insira o nome com que pretende guardar o ficheiro: ");
						String fich= ler.nextLine();
						File fout= new File (fich);
						PrintWriter pwf = new PrintWriter (fout);
						for (int i = 0; i < (new_elementos + new_elementos2); i++){
							pwf.println(afile[i]);
						}
						pwf.close();
						System.out.println("Ficheiro gravado com sucesso!");
						System.out.print("\n");
						
						
			}
		} while (option!=10);
		
	}
	
	public static int ler (int a[], int dim) {
		int n;
		for (int i = 0; i < a.length ; i++) {
			System.out.printf("Número %d= ", (i+1));
			n= ler.nextInt();
			if (n==0) {
				break;
			}
			a[i]=n;		
			dim++;
		}
		for (int i2 = dim; i2 < a.length ; i2++) {
			a[i2]=0;
		}
		System.out.print ("\n");
		return dim;
	}
	
	public static void escrever (int a[], int dim) {
		for (int i = 0; i < dim ; i++) {
			System.out.printf ("a[%d] = %d\n", i+1, a[i]); 
		}
		System.out.print("\n");
	}
	
	public static void max (int a[]) {
		int max;
		max= a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				max= a[i];
			}	
		}
		System.out.printf("Máximo=> %d\n", max);
		System.out.print ("\n");
	}
	
	public static void min (int a[], int dim) {
		int min;
		min= a[0];
		for (int i = 1; i < dim; i++) {
			if (a[i]<min) {
				min= a[i];
			}	
		}
		System.out.printf("Mínimo=> %d\n", min);
		System.out.print ("\n");
	}
	
	public static void media (int a[], int dim) {
		int soma=0;
		double media;
		for (int i = 0; i < dim ; i++) {
			soma= soma+ a[i];
		}
		media= (double) soma/dim;
		System.out.printf("Média=> %.2f\n", media);
		System.out.print ("\n");
	}
	
	public static void pares (int a[], int dim) {
		boolean prim=true;
		for (int i = 0; i < dim ; i++) {
			if (a[i]%2!=0) {
				prim= false;
			}	
		}
		if (prim==true) {
			System.out.print ("A seguência é composta somente por números pares.\n");
		}
		else if (prim==false) {
			System.out.print ("A seguência possui números ímpares.\n");
		}
		System.out.print("\n");
	}
		
}	
