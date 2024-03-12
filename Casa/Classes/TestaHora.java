import java.util.Scanner;

public class TestaHora {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    Hora inicio;  
    Hora fim;
    
    fim = new Hora();
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    System.out.print("Começou às ");
    printHora(inicio);  
    System.out.println(".");
    System.out.println("Quando termina?");
    lerHora(fim);  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
  }
  
  public static void printHora(Hora x) {
	  System.out.printf("%2d:%2d:%2d", x.h, x.m, x.s);
  }
  
  public static void lerHora(Hora fim) {
	  do {
		  System.out.print("horas? ");
		  fim.h = sc.nextInt();
	  } while (fim.h < 0 || fim.h > 23);
	  do {
		  System.out.print("minutos? ");
		  fim.m = sc.nextInt();
	  } while (fim.m < 0 || fim.m > 59);
	  do {
		  System.out.print("segundos? ");
		  fim.s = sc.nextInt();
	  } while (fim.s < 0 || fim.s > 59);
  }
  
}

class Hora {
	int h;
	int m;
	int s;
}

/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
