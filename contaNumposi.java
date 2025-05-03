import java.util.Scanner;

public class contaNumposi{
    static Scanner scanner = new Scanner(System.in);
    // Método principal para ejecutar el programa 
    public static void main(String[] args) {
        mostrarInstrucciones();
        contarNumerosPositivos();
    }

    // Método para mostrar instrucciones
    public static void mostrarInstrucciones() {
        System.out.println("Ingrese números positivos. Para finalizar, ingrese -1.");
    }

    // Método para leer y contar números
    public static void contarNumerosPositivos() {
        int contador = 0;

        for (int numero = 0; numero != -1;) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de números positivos ingresados: " + contador);
    }

    
}
