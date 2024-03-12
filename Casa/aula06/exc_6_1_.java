import java.util.*;

public class exc_6_1_ {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[];
		
		System.out.print("Quantos números quer inserir besta?\n");
		int number = sc.nextInt();
		
		a = new int[number];
		
		for (int i = 0; i < number; i++){
			System.out.printf("Número %d: ", i+1);
			a[i] = sc.nextInt();
		}
		
		for (int i = number-1; i >= 0; i--) {
			System.out.printf("%d\n", a[i]);
		}
		
		
	}
}

