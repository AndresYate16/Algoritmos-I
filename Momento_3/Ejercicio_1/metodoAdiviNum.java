import java.util.Random;
import java.util.Scanner;

public class metodoAdiviNum {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);
    static int numeroSecreto = rand.nextInt(20) + 1;  
    static int intento = 0;
    static int contador = 0;
    public static void main(String[] args) {
        instrucciones();
        juego();
        
    }
    public static void instrucciones() {
        System.out.println("Adivina un numero entre 1 y 20.");
    }
    public static void juego(){
        while (intento != numeroSecreto) {
            System.out.print("Ingresa el numero: ");
            intento = sc.nextInt();
            contador++;

            if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + contador + " intentos.");
            }
        } 
    }

}
