import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        int tentativa = 0;
        int numeroGerado = new Random().nextInt(100);
        int numDigitado = 0;


        while (tentativa < 5) {
            System.out.println("Você tem 5 tentativas para adividar o número entre 0 e 100: ");
            numeroGerado = leitor.nextInt();
            tentativa++;

            if (numDigitado == numeroGerado) {
                System.out.print("Parabéns você acertou!");
                break; //Interrompe o loop whipe
            } else if (numDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }
        if (tentativa == 5 && numDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}

                
