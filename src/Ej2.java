import java.util.HashSet;
import java.util.Set;

public class Ej2 {

    public static void main(String[] args) {
        char[] vectorA = {'a', 'b', 'c', 'd', 'e'};
        char[] vectorB = {'c', 'd', 'e', 'i', 'o'};

        Set<Character> union = new HashSet<>();
        Set<Character> interseccion = new HashSet<>();

        for (char elemento : vectorA) {
            union.add(elemento);
            if (estaEnVector(elemento, vectorB)) {
                interseccion.add(elemento);
            }
        }

        for (char elemento : vectorB) {
            union.add(elemento);
        }

        System.out.println("Unión: " + union);
        System.out.println("Intersección: " + interseccion);
    }

    public static boolean estaEnVector(char elemento, char[] vector) {
        for (char valor : vector) {
            if (valor == elemento) {
                return true;
            }
        }
        return false;
    }
}
