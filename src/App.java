import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = gerador.nextInt(100);
        System.out.println("Adivinhe um numero que estou pensando entre 0 e 100:");
        int numeroUsuario = scanner.nextInt();

        if (numeroAleatorio == numeroUsuario) {
            System.out.println("Parabéns! Você adivinhou o número!");
        } else {
            System.out.println("Que pena! O número era: " + numeroAleatorio);            
        }

        scanner.close();


    }
}
