public class NumerosPares {

    // Paso 1: Método para mostrar instrucciones
    public static void mostrarInstrucciones() {
        System.out.println("Este programa muestra todos los números pares entre 1 y 20.");
    }

    // Paso 2: Método para imprimir números pares
    public static void imprimirNumerosPares() {
        for (int Numero = 1; Numero <= 20; Numero++) {
            if (Numero % 2 == 0) {
                System.out.println(Numero);
            }
        }
    }

    // Paso 3: Método principal
    public static void main(String[] args) {
        mostrarInstrucciones();
        imprimirNumerosPares();
    }
}
