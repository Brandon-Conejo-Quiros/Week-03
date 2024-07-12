import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nombres de los países
        String[] paises = {"Guatemala", "Belice", "El Salvador", "Honduras", "Nicaragua", "Costa Rica", "Panamá"};

        // Datos iniciales para los años 2003 y 2004 (pre-ingresados)
        double[][] datos = {
                {10650.549, 12219.7},   // Guatemala
                {0, 0},                 // Belice (Sin datos)
                {6474.64, 6166.72},     // El Salvador
                {6493.073, 7614.87},    // Honduras
                {3816.6, 4007.209},     // Nicaragua
                {6474.64, 6405.1},      // Costa Rica
                {6045.7, 5660.69}       // Panamá
        };

        // Calcular el porcentaje de diferencia
        for (int i = 0; i < paises.length; i++) {
            if (datos[i][0] != 0) { // Solo calcular si hay datos
                datos[i][1] = ((datos[i][1] - datos[i][0]) / datos[i][0]) * 100; // porcentaje
            } else {
                datos[i][1] = 0; // Sin datos
            }
        }

        // Solicitar años de proyección
        System.out.println("Ingrese el número de años de proyección:");
        int anosProyeccion = scanner.nextInt();
        double[][] proyecciones = new double[paises.length][anosProyeccion];

        // Calcular las proyecciones
        for (int i = 0; i < paises.length; i++) {
            if (datos[i][0] != 0) { // Solo calcular si hay datos
                double crecimiento = datos[i][1] / 100; // convertir a decimal
                proyecciones[i][0] = datos[i][1]; // iniciar con el valor de 2004
                for (int j = 1; j < anosProyeccion; j++) {
                    proyecciones[i][j] = proyecciones[i][j - 1] * (1 + crecimiento);
                }
            }
        }

        // Imprimir la matriz de resultados
        System.out.printf("%-15s %-10s %-10s %-10s ", "País", "2003", "2004", "Porcentaje");
        for (int i = 1; i <= anosProyeccion; i++) {
            System.out.printf("Año %d  ", 2004 + i);
        }
        System.out.println();

        for (int i = 0; i < paises.length; i++) {
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f ", paises[i], datos[i][0], datos[i][1], datos[i][1]);
            for (int j = 0; j < anosProyeccion; j++) {
                System.out.printf("%.2f  ", proyecciones[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
