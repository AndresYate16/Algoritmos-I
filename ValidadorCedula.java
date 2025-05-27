import java.util.Scanner;

public class ValidadorCedula {

    public static boolean esFormatoCedulaValido(String numeroCedula) {
        if (numeroCedula.length() != 10) {
            return false;
        }
        if (numeroCedula.charAt(0) == '0') {
            return false;
        }
        for (char caracter : numeroCedula.toCharArray()) {
            if (!Character.isDigit(caracter)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        System.out.println("Bienvenido al Sistema Validador de Cédulas");
        System.out.println("------------------------------------------------------");

        do {
            System.out.print("Ingrese el número de cédula a validar: ");
            String cedulaIngresada = scanner.nextLine();

            if (esFormatoCedulaValido(cedulaIngresada)) {
                System.out.println("Formato de Cédula VÁLIDO.");
            } else {
                System.out.println("Formato de Cédula INVÁLIDO.");
            }

            System.out.print("¿Desea validar otra cédula? (S/N): ");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("Gracias por usar el validador. ¡Hasta luego!");
        scanner.close();
    }
}
