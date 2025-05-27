import java.util.Scanner;

public class CalculadoraTarifasEnvio {
    // Costos base por zona (valores fijos en pesos colombianos)
    public static final double COSTO_BASE_LOCAL = 5000.0;
    public static final double COSTO_BASE_NACIONAL = 15000.0;
    public static final double COSTO_BASE_INTERNACIONAL = 50000.0;

    // Costo adicional por kilogramo (valores fijos en pesos colombianos)
    public static final double COSTO_ADICIONAL_POR_KG_LOCAL = 1000.0;
    public static final double COSTO_ADICIONAL_POR_KG_NACIONAL = 3000.0;
    public static final double COSTO_ADICIONAL_POR_KG_INTERNACIONAL = 10000.0;

    public static double calcularCostoAdicionalPorPeso(double pesoKg, int zona) {
        double costoAdicional = 0.0;

        if (pesoKg < 0) {
            return 0.0;
        }

        switch (zona) {
            case 1: // Local
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_LOCAL;
                break;
            case 2: // Nacional
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_NACIONAL;
                break;
            case 3: // Internacional
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_INTERNACIONAL;
                break;
            default:
                System.out.println("Advertencia: Zona no válida para costo adicional.");
                costoAdicional = 0.0;
                break;
        }
        return costoAdicional;
    }

    public static double obtenerCostoBasePorZona(int zona) {
        double costoBase = 0.0;
        switch (zona) {
            case 1:
                costoBase = COSTO_BASE_LOCAL;
                break;
            case 2:
                costoBase = COSTO_BASE_NACIONAL;
                break;
            case 3:
                costoBase = COSTO_BASE_INTERNACIONAL;
                break;
            default:
                System.out.println("Advertencia: Zona no válida para costo base.");
                break;
        }
        return costoBase;
    }

    public static double calcularTarifaTotal(double pesoKg, int zona) {
        double tarifaTotal = 0.0;
        double costoBase = obtenerCostoBasePorZona(zona);
        double costoAdicional = calcularCostoAdicionalPorPeso(pesoKg, zona);
        tarifaTotal = costoBase + costoAdicional;
        return tarifaTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Calculadora de Tarifas de Envío Logística Veloz S.A. ---");

        double pesoPaquete = -1.0;

        // Lectura y validación del peso del paquete
        do {
            System.out.print("Ingrese el peso del paquete en kilogramos (ej: 2.5): ");
            if (scanner.hasNextDouble()) {
                pesoPaquete = scanner.nextDouble();
                if (pesoPaquete <= 0) {
                    System.out.println("Error: El peso debe ser un número positivo.");
                }
            } else {
                System.out.println("Error: Entrada inválida. Ingrese un número.");
                scanner.next(); // limpiar entrada inválida
            }
        } while (pesoPaquete <= 0);

        int zonaEnvio = 0;

        // Lectura y validación de la zona de envío
        do {
            System.out.println("Seleccione la zona de envío:");
            System.out.println("1. Local");
            System.out.println("2. Nacional");
            System.out.println("3. Internacional");
            System.out.print("Opción (1-3): ");
            if (scanner.hasNextInt()) {
                zonaEnvio = scanner.nextInt();
                if (zonaEnvio < 1 || zonaEnvio > 3) {
                    System.out.println("Error: Opción inválida. Debe ser 1, 2 o 3.");
                }
            } else {
                System.out.println("Error: Entrada inválida. Ingrese un número.");
                scanner.next(); // limpiar entrada inválida
            }
        } while (zonaEnvio < 1 || zonaEnvio > 3);

        double tarifaFinal = calcularTarifaTotal(pesoPaquete, zonaEnvio);

        System.out.println("\n--- Detalle del Envío ---");
        System.out.println("Peso del Paquete: " + pesoPaquete + " kg");

        String nombreZona = "";
        switch (zonaEnvio) {
            case 1: nombreZona = "Local"; break;
            case 2: nombreZona = "Nacional"; break;
            case 3: nombreZona = "Internacional"; break;
        }

        System.out.println("Zona de Destino: " + nombreZona);
        System.out.println("Tarifa Total de Envío: $" + String.format("%,.2f", tarifaFinal));
        System.out.println("---------------------------");

        scanner.close();
    }
}