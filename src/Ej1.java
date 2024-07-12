
import java.util.Scanner;
import java.util.Random;

public class Ej1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(16) + 15;
        System.out.println("Hello world, nuevo numero: " + randomNumber);

        int[] vector1 = new int[3];
        int[] vector2 = new int[3];

        Scanner scanner = new Scanner(System.in);

        fillVector(vector1, scanner, randomNumber);
        fillVector(vector2, scanner, randomNumber);

        int sumVector1 = sumVector(vector1);
        int sumVector2 = sumVector(vector2);

        System.out.println("Suma del vector 1: " + sumVector1);
        System.out.println("Suma del vector 2: " + sumVector2);

        if (sumVector1 != randomNumber || sumVector2 != randomNumber) {
            System.out.println("La suma de los vectores no concuerda con el numero generado");
        } else {
            System.out.println("La suma de los vectores concuerda con el numero generado");
        }
    }

    public static void fillVector(int[] vector, Scanner scanner, int targetSum) {
        int sum = 0;
        for (int i = 0; i < vector.length; i++) {
            int num;
            do {
                System.out.print("Enter value " + (i + 1) + " of the vector: ");
                num = scanner.nextInt();
                if (num < 1 || num > 10) {
                    System.out.println("El numero debe ser entre 1 y 10");
                } else if (sum + num > targetSum) {
                    System.out.println("La suma es mayor al numero generado");
                } else {
                    vector[i] = num;
                    sum += num;
                    break;
                }
            } while (true);
        }
    }

    public static int sumVector(int[] vector) {
        int sum = 0;
        for (int num : vector) {
            sum += num;
        }
        return sum;
    }
}