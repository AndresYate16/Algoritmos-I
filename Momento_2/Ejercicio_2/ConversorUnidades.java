import java.util.Scanner;

public class ConversorUnidades {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    // Método que muestra el menú y llama a los métodos correspondientes
    public static void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n--- CONVERSOR DE UNIDADES ---");
            System.out.println("1. Metros a centrimetros");
            System.out.println("2. Grados Celsius a Fahrenheit");
            System.out.println("3. Grados Fahrenheit a Celsius");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ConvertirMetACent();
                    break;
                case 2:
                    ConvertirKmAMet();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    // Métodos sin parámetros ni retorno
    public static void sumar() {
        int a = pedirNumero("Ingrese el primer número: ");
        int b = pedirNumero("Ingrese el segundo número: ");
        int resultado = a + b;
        System.out.println("Resultado de la suma: " + resultado);
    }

    public static void restar() {
        int a = pedirNumero("Ingrese el primer número: ");
        int b = pedirNumero("Ingrese el segundo número: ");
        int resultado = a - b;
        System.out.println("Resultado de la resta: " + resultado);
    }

    public static void multiplicar() {
        int a = pedirNumero("Ingrese el primer número: ");
        int b = pedirNumero("Ingrese el segundo número: ");
        int resultado = a * b;
        System.out.println("Resultado de la multiplicación: " + resultado);
    }

    public static void dividir() {
        int a = pedirNumero("Ingrese el primer número: ");
        int b = pedirNumero("Ingrese el segundo número: ");
        if (b != 0) {
            int resultado = a / b;
            System.out.println("Resultado de la división: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }

    // Método auxiliar para pedir números (no cambia el objetivo porque no recibe ni retorna desde los métodos de operación)
    public static int pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }
}