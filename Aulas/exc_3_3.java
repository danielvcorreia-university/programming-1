import java.util.Scanner;

public class exc_3_3 {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);

        int tentativas=0, valor;
        int secret = (int)(100.0*Math.random()) + 1;
        do {
            System.out.print("Adivinhar valor entre 0 e 100:");
            valor = ler.nextInt();
            if (valor > secret)System.out.println("O valor introduzido é Maior");
            if (valor < secret)System.out.println("O valor introduzido é Menor");
            tentativas = tentativas + 1;
        } while(valor != secret);

        System.out.printf("Numero = %3d\nTentativas = %3d\n",valor,tentativas);
    }
}
