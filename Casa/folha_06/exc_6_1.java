import java.util.*;

public class exc_6_1 {
	
	public static void main (String[] args) {
		int a[];
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("LER UM SEQUÊNCIA DE NÚMEROS INTEIROS");
		System.out.println("Quantos números inteiros pretende inserir? ");
		n = sc.nextInt();
		
		a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Insira o número %d \n", i+1);
			a[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS PELA ORDEM INVERSA: ");
		
		for (int i = n-1; i >= 0; i--) {
			System.out.printf("%d\n", a[i]);
		}
		
	}
}

