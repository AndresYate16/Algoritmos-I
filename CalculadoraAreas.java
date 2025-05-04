import java.util.Scanner;

public class CalculadoraAreas {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    // Método que muestra el menú y llama al método correspondiente
    public static void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n--- CÁLCULO DE ÁREAS ---");
            System.out.println("1. Área de Cuadrado");
            System.out.println("2. Área de Rectángulo");
            System.out.println("3. Área de Triángulo");
            System.out.println("4. Área de Círculo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    areaCuadrado();
                    break;
                case 2:
                    areaRectangulo();
                    break;
                case 3:
                    areaTriangulo();
                    break;
                case 4:
                    areaCirculo();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    // Métodos sin parámetros ni retorno, encargados de todo el proceso

    public static void areaCuadrado() {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("Área del cuadrado: " + area);
    }

    public static void areaRectangulo() {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("Área del rectángulo: " + area);
    }

    public static void areaTriangulo() {
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("Área del triángulo: " + area);
    }

    public static void areaCirculo() {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);
    }
}
