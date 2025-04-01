import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = rand.nextInt(20) + 1;  // Número aleatorio entre 1 y 20
        int intento;
        int contador = 0;

        System.out.println("¡Adivina el número entre 1 y 20!");

        do {
            System.out.print("Ingresa tu intento: ");
            intento = sc.nextInt();
            contador++;

            if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + contador + " intentos.");
            }
        } while (intento != numeroSecreto);

        sc.close();
    }
}

