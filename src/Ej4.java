public class Ej4 {

    public static void main(String[] args) {
        // Definición de las matrices
        double[][] matrizA = {
                {3, 2, 1},
                {1, 1, 3},
                {0, 2, 1}
        };

        double[][] matrizB = {
                {2, 1},
                {1, 0},
                {3, 2}
        };

        // Imprimir las matrices originales
        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);

        System.out.println("Matriz B:");
        imprimirMatriz(matrizB);

        // Realizar la operación de suma
        double[][] matrizSuma = realizarSuma(matrizA, matrizB);

        // Imprimir la matriz de resultados de la suma
        System.out.println("Matriz de Suma:");
        imprimirMatriz(matrizSuma);
    }

    // Método para imprimir matrices
    private static void imprimirMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double elemento : fila) {
                System.out.printf("%.1f ", elemento);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para realizar la suma de matrices
    private static double[][] realizarSuma(double[][] matrizA, double[][] matrizB) {
        int filasA = matrizA.length;
        int columnasB = matrizB[0].length;

        double[][] resultado = new double[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                // Realizar la suma de acuerdo a la fórmula proporcionada
                resultado[i][j] = (matrizA[i][0] * matrizB[0][j]) + (matrizA[i][1] * matrizB[1][j]) + (matrizA[i][2] * matrizB[2][j]);
            }
        }
        return resultado;
    }
}