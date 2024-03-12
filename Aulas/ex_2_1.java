import java.util.Scanner;

	public class ex_2_1 {
		
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			// variáveis
			double A, B, C, D;
			double notafinal;
			
			System.out.println("Nota de TP1:");
			A = ler.nextDouble();
			System.out.println("Nota de TP2:");
			B = ler.nextDouble();
			System.out.println("Nota de API:");
			C = ler.nextDouble();
			System.out.println("Nota de EP:");
			D = ler.nextDouble();
			
			notafinal = (A*0.10 + B*0.10 + C*0.30 + D*0.50);
			
			if (notafinal >= 0 && notafinal < 9.5)
				System.out.println("Reprovado.");
			else if (notafinal >= 9.5 && notafinal <= 20)
				System.out.println("Aprovado.");
			else if (notafinal > 20 || notafinal < 0)
				System.out.println("Notas introduzidas incorretamente.");
		}
	}
	
