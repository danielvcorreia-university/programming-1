import java.util.Scanner;

	public class ex_2_2 {
	
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			//variáveis
			double A, B;
				System.out.print("Introduza o primeiro número:");
				A = ler.nextDouble();
				System.out.print("Introduza o segundo número:");
				B = ler.nextDouble();
			
			if (A < B)
				System.out.print("O maior valor é:" + B);
			else if (A > B)
				System.out.print("O maior valor é:" + A);
			else if (A == B)
				System.out.print("Os valores são iguais!");
		}
	}
