import java.util.Scanner;

public class SistemaAvanzadoInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_PRODUCTOS = 10;

        String[] nombres = new String[MAX_PRODUCTOS];
        int[] cantidades = new int[MAX_PRODUCTOS];
        double[] precios = new double[MAX_PRODUCTOS];

        int opcion;

        do {
            System.out.println("\n===== MENÚ DE INVENTARIO =====");
            System.out.println("1. Registrar o modificar producto");
            System.out.println("2. Buscar producto por nombre");
            System.out.println("3. Calcular valor total del inventario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la posición (0-9) para registrar/modificar: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer

                    if (pos >= 0 && pos < MAX_PRODUCTOS) {
                        System.out.print("Nombre del producto: ");
                        nombres[pos] = scanner.nextLine();

                        System.out.print("Cantidad: ");
                        cantidades[pos] = scanner.nextInt();

                        System.out.print("Precio: ");
                        precios[pos] = scanner.nextDouble();
                    } else {
                        System.out.println("Posición inválida. Debe estar entre 0 y 9.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBusqueda = scanner.nextLine();
                    boolean encontrado = false;

                    int i = 0;
                    do {
                        if (nombres[i] != null && nombres[i].equalsIgnoreCase(nombreBusqueda)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Nombre: " + nombres[i]);
                            System.out.println("Cantidad: " + cantidades[i]);
                            System.out.println("Precio: $" + precios[i]);
                            encontrado = true;
                        }
                        i++;
                    } while (i < MAX_PRODUCTOS && !encontrado);

                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    double total = 0;
                    int j = 0;
                    do {
                        if (nombres[j] != null) {
                            total += cantidades[j] * precios[j];
                        }
                        j++;
                    } while (j < MAX_PRODUCTOS);
                    System.out.println("Valor total del inventario: $" + total);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
