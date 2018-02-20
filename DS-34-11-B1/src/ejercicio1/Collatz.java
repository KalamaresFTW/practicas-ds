package ejercicio1;

/**
 * @author p.costa
 * @author pablo.aragunde
 */
public class Collatz {

    public static final int MAX_ARRAY_SIZE = 300;

    /**
     * Método que toma un número natural n y devuelve la serie de Collatz
     * asociada a ese número.
     *
     * @param n número a partir de el que se generará la serie
     * @return int[] serie de Collatz asociada a n
     */
    public static int[] collatz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El parámetro n debe ser positivo");
        } else {
            int[] serie = new int[MAX_ARRAY_SIZE];
            int i = 0;
            serie[i] = n; //guardamos el primer término de la serie
            while (n != 1) {
                i++;
                if (n % 2 == 0) { //es par
                    n = n / 2;
                    serie[i] = n;
                } else {          //es impar
                    n = n * 3 + 1;
                    serie[i] = n;
                }
            }
            return serie;
        }
    }

    /**
     * Método que devuelve la longitud de una serie de Collatz que se pasa por
     * parámetro.
     *
     * @param list serie de Collatz en forma de array de ints
     * @return int longitud de la serie
     */
    public static int lengthCollatz(int[] list) {
        if (list == null) {
            throw new IllegalArgumentException("La lista proporcionada no es válida");
        } else {
            int i;
            for (i = 0; i < list.length; i++) {
                if (list[i] == 1) {
                    break;
                }
            }
            return i + 1;
        }
    }
    
//    Recursion is way too cool to be used in java :D
//    private static int internalCollatz(int n) {
//        System.out.println(n);
//        if (n == 1) {
//            return 1;
//        } else if ((n % 2) == 0) {
//            return internalCollatz(n/ 2);
//        }
//        if ((n % 2) != 0) {
//            return internalCollatz(n * 3 + 1);
//        } else {
//            return 1;
//        }
//    }
}
