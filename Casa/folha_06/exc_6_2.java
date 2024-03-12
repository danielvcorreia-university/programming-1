import java.util.*;
import java.io.*;

public class exc_6_2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number, cont = 0;
		int a[] = new int[100];
		
		do {
			System.out.print("Qual o número que pretende saber as suas repetições? ");
			number = sc.nextInt();
		} while (number < 0);
		
		for (int i = 0; i < 100; i++) {
			System.out.printf("Número %d \n", i+1);
			a[i] = sc.nextInt();
			
			if (a[i] == number) {
				cont++;
			}
			
			else if (a[i] < 0) {
				break;
			}
		}
		
		System.out.printf("O número %d apareceu %d vezes. ", number, cont);
		
	}
}

