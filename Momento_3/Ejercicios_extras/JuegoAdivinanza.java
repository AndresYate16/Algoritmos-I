import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_INTENTOS = 10;
        final int MAX_JUEGOS = 5;

        int[] puntajes = new int[MAX_JUEGOS];
        int juegosRealizados = 0;

        for (int partida = 0; partida < MAX_JUEGOS; partida++) {
            int numeroSecreto = (int)(Math.random() * 100) + 1;
            boolean adivinado = false;
            int puntajeObtenido = 0;

            System.out.println("\n=== JUEGO " + (partida + 1) + " ===");
            System.out.println("Adivina el número entre 1 y 100. Tienes 10 intentos.");

            for (int intento = 1; intento <= MAX_INTENTOS; intento++) {
                System.out.print("Intento " + intento + ": ");
                int numeroUsuario = scanner.nextInt();

                if (numeroUsuario == numeroSecreto) {
                    System.out.println("¡Correcto! Has adivinado el número.");
                    puntajeObtenido = 100 - ((intento - 1) * 10);
                    adivinado = true;
                    break;
                } else if (numeroUsuario < numeroSecreto) {
                    System.out.println("El número secreto es mayor.");
                } else {
                    System.out.println("El número secreto es menor.");
                }
            }

            if (!adivinado) {
                System.out.println("¡No adivinaste el número! El número secreto era: " + numeroSecreto);
            }

            puntajes[juegosRealizados] = puntajeObtenido;
            juegosRealizados++;

            System.out.println("Puntaje obtenido: " + puntajeObtenido);

            System.out.println("\nHistorial de puntajes:");
            for (int i = 0; i < juegosRealizados; i++) {
                System.out.println("Juego " + (i + 1) + ": " + puntajes[i] + " puntos");
            }

            scanner.nextLine(); // Limpiar buffer
            System.out.print("\n¿Deseas jugar otra vez? (si/no): ");
            String respuesta = scanner.nextLine().toLowerCase();
            if (!respuesta.equals("si")) {
                break;
            }
        }

        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
        scanner.close();
    }
}
