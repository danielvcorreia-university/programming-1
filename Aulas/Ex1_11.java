import java.util.Scanner;

public class Ex1_11
{
	public static void main(String[] args)
	{
		//Scanner da quantidade de dólares e a taxa de conversão
		Scanner sc = new Scanner(System.in);
		double dolares, taxa;
		double euros;
		
		//1) Ler as variáveis
		System.out.print(" quantia de dólares; ");
		dolares = sc.nextDouble();
		System.out.print(" taxa de conversão: ");
		taxa = sc.nextDouble();
		
		//2) Calcular 
		euros = dolares * taxa;
		
		//3) Escrever os resultados 
		System.out.printf("%f dólares equivalem a %f euros .", dolares, euros);
		}
	}
