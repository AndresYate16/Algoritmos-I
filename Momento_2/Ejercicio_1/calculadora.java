import java.util.Scanner;

public class CalculadoraDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int OpcUser = 0, numA = 0, numB = 0;
        boolean Key = true;

        do {
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Factorial de un número");
            System.out.println("6. Salir");
            System.out.print("Opción seleccionada: ");
            OpcUser = scanner.nextInt();

            switch (OpcUser) {
                case 1:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();
                    System.out.println(numA + " + " + numB + " = " + (numA + numB));
                    break;

                case 2:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();
                    System.out.println(numA + " - " + numB + " = " + (numA - numB));
                    break;

                case 3:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();
                    System.out.println(numA + " * " + numB + " = " + (numA * numB));
                    break;

                case 4:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();
                    if (numB != 0) {
                        System.out.println(numA + " / " + numB + " = " + (numA / numB));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese un número para calcular el factorial: ");
                    int numero = scanner.nextInt();
                    if (numero < 0) {
                        System.out.println("Error: el factorial no está definido para números negativos.");
                    } else {
                        long factorial = 1;
                        int i = 1;
                        do {
                            factorial *= i;
                            i++;
                        } while (i <= numero);
                        System.out.println("El factorial de " + numero + " es " + factorial);
                    }
                    break;

                case 6:
                    System.out.println("Gracias, hasta pronto!");
                    Key = false;
                    break;

                default:
                    System.out.println("Opción no válida!");
                    break;
            }
        } while (Key);

        scanner.close();
    }
}


