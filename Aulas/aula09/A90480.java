import java.util.*;

public class A90480 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		
		int n, nDiferencas;
		double media;
		
		System.out.print("Quantos números quer comparar?");
		n = sc.nextInt();
		nDiferencas = n-1;
		
		int a[] = new int[n];
		int b[] = new int[nDiferencas];
		
		lerNumeros(n, a);
		arrayDiferencas(nDiferencas, a, b);
		
		System.out.printf("A média da diferença entre todos os pares de valores consecutivos é de %f\n", calcularMedia(nDiferencas, b));
	}
	
	public static void lerNumeros (int n, int a[]) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Qual o valor %d?\n", i+1);
			a[i] = sc.nextInt();
		}
	}
	
	public static void arrayDiferencas (int nDiferencas, int a[], int b[]) {
		int diferenca = a[0];
		
		for (int i = 0; i < nDiferencas; i++) {
			diferenca = a[i] - a[i+1];
			b[i] = diferenca;
		}
	}
	
	public static double calcularMedia (int nDiferencas, int b[]) {
		double media;
		int soma = 0;
		
		for (int i = 0; i < nDiferencas; i++) {
			soma = soma + b[i];
		}
		
		media = (double)soma / (double)nDiferencas;
		
		return media;
	}
}
