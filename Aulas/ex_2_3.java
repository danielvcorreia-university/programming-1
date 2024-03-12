import java.util.Scanner;
	
	public class ex_2_3 {
		
		public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		//variáveis
		int idade;
			System.out.print("Qual é a sua idade?");
			idade = ler.nextInt();
		if ( idade > 0 && idade < 6)
		System.out.print("Isento de pagamento");
		else if ( idade >= 6 && idade <= 12)
		System.out.print("Bilhete de criança");
		else if ( idade >= 13 && idade <= 65)
		System.out.print("Bilhete normal");
		else if ( idade > 65 )
		System.out.print("Bilhete de 3ªidade");
		else
		System.out.print("Idade introduzida incorretamente");
		}
	}
