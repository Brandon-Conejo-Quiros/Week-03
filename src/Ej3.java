public class Ej3 {

    public static void main(String[] args) {
        int[][] matrizUno = {
                {10, 6},
                {3, 5}
        };

        int[][] matrizDos = {
                {9, 2, 10, 6},
                {16, 10, 6, 3},
                {3, 3, 5, 5},
                {0, 2, 1, 7}
        };

        boolean encontrada = estaContenida(matrizUno, matrizDos);

        if (encontrada) {
            System.out.println("La matriz uno está contenida en la matriz dos.");
        } else {
            System.out.println("La matriz uno NO está contenida en la matriz dos.");
        }
    }

    public static boolean estaContenida(int[][] matrizUno, int[][] matrizDos) {
        int filasUno = matrizUno.length;
        int columnasUno = matrizUno[0].length;
        int filasDos = matrizDos.length;
        int columnasDos = matrizDos[0].length;

        // Iterar sobre todas las posiciones posibles en matrizDos
        for (int i = 0; i <= filasDos - filasUno; i++) {
            for (int j = 0; j <= columnasDos - columnasUno; j++) {
                if (matricesCoinciden(matrizUno, matrizDos, i, j)) {
                    return true; // Se encontró la matriz uno en matriz dos
                }
            }
        }
        return false; // No se encontró
    }

    private static boolean matricesCoinciden(int[][] matrizUno, int[][] matrizDos, int inicioFila, int inicioColumna) {
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[0].length; j++) {
                if (matrizUno[i][j] != matrizDos[inicioFila + i][inicioColumna + j]) {
                    return false; // Hay un elemento que no coincide
                }
            }
        }
        return true; // Todos los elementos coinciden
    }
}