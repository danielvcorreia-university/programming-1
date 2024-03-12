import java.util.Scanner;
	
public class exc_3_1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, cont = 0;
		do{	
			System.out.println("Introduza números inteiros positivos e por fim um negativo: ");
			x = ler.nextInt();
			cont++;
		}while (x >= 0);
		System.out.printf("Valor %d lido em %d tentativas\n",x, cont);
	
		
	}	
}

