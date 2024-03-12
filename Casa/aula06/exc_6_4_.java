import java.util.*;

public class exc_6_4_ {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		int numberNotas;
		
		do {
			System.out.print("Quantas notas pretende inserir ? ");
			numberNotas = sc.nextInt();
		} while(numberNotas < 0 || numberNotas > 50);
		
		int a[] = new int[numberNotas];
		int b[] = new int[21];
		char c[][] = new char[21][50];
		
		Notas(a);
		ArrayInt(a, b);
		ArrayChar(b, c);
		ImprimirHistograma(c);
		
	}
	
	public static void Notas(int a[]) {
		for (int i = 0; i < a.length; i++) {
			do {
				System.out.printf("Nota número %d: ", i+1);
				a[i] = sc.nextInt();
			} while (a[i] < 0 || a[i] > 20);
		}
	}
	
	public static void ArrayInt(int a[], int b[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 21; j++) {
				if (a[i] == j) {
					b[j] = b[j] + 1;
				}
			}
		}
	}
	
	public static void ArrayChar(int b[], char c[][]) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i]; j++) {
				c[i][j] = '*';
			}
		}
	}
	
	public static void ImprimirHistograma(char c[][]) {
		for (int i = 20; i >= 0; i--) {
			System.out.printf("%d | ", i);
			
			for (int j = 0; j < 50; j++) {
				System.out.printf("%c", c[i][j]);
			}
			
			System.out.println("");
		}
	}
}

