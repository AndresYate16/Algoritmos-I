import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        int edad;
        int mayedad = 0;
        int menedad = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingresa la edad (el programa terminará si ingresas un número negativo):");
            edad = sc.nextInt();

            if (edad < 0) {
                break;  // Termina el programa si el número es negativo
            }

            if (edad >= 18) {
                mayedad++;  // Cuenta como mayor de edad
            } else {
                menedad++;  // Cuenta como menor de edad
            }
        }

        sc.close();
        System.out.println("Programa terminado");
        System.out.println(mayedad + " personas son mayores de edad y " + menedad + " personas son menores de edad");
    }
}
