import java.util.Scanner;

public class Ex1_10
{
	public static void main(String[] args)
	{
		//Scanner da temperatura em graus Celsius
		Scanner keyboard = new Scanner(System.in);
		double dim1;
		double dim2;
		
		// 1) Ler a variável 
		System.out.print("Temperatura em graus Celsius: ");
		dim1 = keyboard.nextDouble();
		
		// 2) calcular o valor da temperatura em Fahrenheit
		dim2 = 1.8*dim1+32;
		
		// 3) Escrever os resultados 
		System.out.printf("%.2f ºCelsius é equivalente a %.2f ºFahrenheit", dim1, dim2);
	}
}
