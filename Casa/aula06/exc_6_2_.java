import java.util.*;

public class exc_6_2_ {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		
		int a[] = new int[100];
		int number, cont;
		
		System.out.print("Qual é o número que quer verificar quantas vezes apareceu seu morcão? ");
		number = sc.nextInt();
		
		cont = readNumbers(a, number);
		
		System.out.printf("O número %d apareceu %d vezes! ", number, cont);
		
	}
	
	public static int readNumbers(int a[], int number) {
		int cont = 0;
		
		for (int i = 0; i < 100; i++) {
				System.out.printf("Número %d: ", i+1);
				a[i] = sc.nextInt();
			
			if (a[i] == number) {
				cont++;
			}
			
			
			else if (a[i] < 0 || i == 99) {
				break;
			}
		}
		
		return cont;
	}
}


