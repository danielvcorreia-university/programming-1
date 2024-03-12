import java.util.*;
import java.io.*;

public class exc_6_3 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int number, selector;
		char a[][]= new char[21][50];
		
		System.out.print("Número de notas a processar: ");
		number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			do {
				System.out.printf("Número %d: \n", i+1);
				selector = sc.nextInt();
			} while (selector < 0 || selector > 20);
			
			for (int j = 0; j < 21; j++) {
				if (selector == j) {
					a[j] = a[j] + '*';
				}
			}
		}
		
		System.out.println("");
		
		for (int i = 19; i >= 0; i--){
			System.out.printf("%d | %c\n", i+1, a[i]);
		}
	}
}

