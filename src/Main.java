/*=================================================================================
Study Center....: Universidad Tecnica Nacional
Campus..........: Pacifico (JRMP)
College career..: Ingenieria en Tecnologias de Información
Period..........: 2C-2024
Course..........: ITI-221 - Programación I
Document........: class_03 - main.java
Goals...........: Declare and use of arrays, matrix and cube
Professor.......: Jorge Ruiz (york)
Student.........: Brandon Conejo Quirós
=================================================================================*/
import java.util.Arrays;
/*=================================================================================*/


public class Main {
    public static void main(String[] args) {


//        // Declaring single array
//        int[] numeros = new int[10];
//
//        // Load random numbers into the array
//        for (int i = 0; i < numeros.length; i++) {
//            numeros[i] = (int) (Math.random() * 100);
//        }
//
//        // Print the array in the single line
//        System.out.println("Array 1: " + Arrays.toString(numeros));
//
//        // Print the array in reverse
//        for (int i = numeros.length - 1; i >= 0; i--) {
//            System.out.print(numeros[i] + " ");
//        }
//
//        // Organize the array in ascending order
//        Arrays.sort(numeros);
//
//        // Print the array
//        System.out.println("\nArray ASC: " + Arrays.toString(numeros));
//
//        // Organize the array in descending order
//        for (int i = 0; i < numeros.length / 2; i++) {
//            int temp = numeros[i];
//            numeros[i] = numeros[numeros.length - 1 - i];
//            numeros[numeros.length - 1 - i] = temp;
//        }
//
//        // Some functions of the Arrays class
//        Boolean encontro = Arrays.stream(numeros).anyMatch(i -> i == 50);
//        System.out.println("Encontro el 50: " + encontro);
//
//        int pos = Arrays.binarySearch(numeros, 50);
//        System.out.println("Posicion del 50: " + pos);
//
//        int[] copia = Arrays.copyOf(numeros, numeros.length);
//        System.out.println("Copia 1: " + Arrays.toString(copia));
//
//        int[] copia2 = Arrays.copyOfRange(numeros, 0, 5);
//        System.out.println("Copia 2: " + Arrays.toString(copia2));
//
//        int[] copia3 = Arrays.copyOfRange(numeros, 5, 20);
//        System.out.println("Copia 3: " + Arrays.toString(copia3));
//
//
//        // Print line
//        System.out.println("\n=======================================\n");







//        // Declaring a matrix
//        int[][] matriz = new int[3][3];
//
//        // Load random numbers into the matrix
//        for(int i = 0;  i < matriz.length ; i++) {
//            for(int j = 0;  j < matriz[i].length ; j++) {
//                matriz[i][j] = (int) (Math.random() * 100);
//            }
//        }
//
//        // Print the matrix in a single line
//        System.out.println("Matrix: " + Arrays.deepToString(matriz));
//
//
//        // Print the matrix
//        for(int i = 0;  i < matriz.length ; i++) {
//            for(int j = 0;  j < matriz[i].length ; j++) {
//                matriz[i][j] = (int) (Math.random() * 100);
//            }
//        }
//
//        // Another way to print the matrix
//        int fila = 0;
//        for (int[] ints : matriz) {
//            System.out.println("Matrix[ " + fila++ + " ]: " + Arrays.toString(ints));
//        }
//
//
//        // Print line
//        System.out.println("\n=======================================\n");







        // Declaring a cube
        int[][][] cubo = new int[3][3][3];

        // Load random numbers into the cube
        for(int fil = 0;  fil < cubo.length ; fil++) {
            for(int col = 0;  col < cubo[fil].length ; col++) {
                for(int prof = 0;  prof < cubo[fil][col].length ; prof++) {
                    cubo[fil][col][prof] = (int) (Math.random() * 100);
                }
            }
        }

        // Print the cube in a single line
        System.out.println("Cube: " + Arrays.deepToString(cubo));


        // Print the cube
        for(int fil = 0;  fil < cubo.length ; fil++) {
            for(int col = 0;  col < cubo[fil].length ; col++) {
                for(int prof = 0;  prof < cubo[fil][col].length ; prof++) {
                    System.out.print(cubo[fil][col][prof] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Another way to print the cube
        for(int fil = 0;  fil < cubo.length ; fil++) {
            for(int col = 0;  col < cubo[fil].length ; col++) {
                System.out.println("Cube[ " + fil + " ][ " + col + " ]: " + Arrays.toString(cubo[fil][col]));
                System.out.println();
            }
            System.out.println();
        }




    }
}