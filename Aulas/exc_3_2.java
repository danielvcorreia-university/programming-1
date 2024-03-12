import java.util.Scanner;
	public class exc_3_2 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int x,produto;
			x = 1;
			produto=1;

			System.out.println("Introduza uma lista de números (terminada com 0) :");
			
			while (x != 0){
				x = ler.nextInt();
				if ( x != 0) {
				produto = produto * x;
			}
			}
			
			System.out.printf("O produto dos valores introduzidos é %d", produto);
		}
	}
