import java.util.*;

public class exc_5_9 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.print("Insira um número inteiro positivo: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		System.out.printf("LISTA DE NÚMEROS PRIMOS DE 1 A %d\n", numero);
		for (int i = 1; i <= numero; i++) {
			if (primitividade(i) == true) {
				System.out.printf("--> %d\n", i);
			}
		}
		
	}
	
	public static boolean primitividade (int numero) {
		
		int cont = 0;
		
		for (int i = numero; i > 0; i--) {
			if (numero % i == 0) {
				cont++;
			}
		}
		
		if (cont <= 2) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
}

