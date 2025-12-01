package h2;

public class H2_main {

    // Geforderte Methode
    public static boolean compareArrays(int[] a, int[] b) {

        // Wenn die Arrays unterschiedlich lang sind → sofort false
        if (a.length != b.length) {
            return false;
        }

        // Werte und Reihenfolge vergleichen
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true; // alle Elemente gleich & gleiche Reihenfolge
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};
        int[] e = {1, 2, 3};

        System.out.println("compareArrays(a, b): " + compareArrays(a, b)); // false
        System.out.println("compareArrays(a, c): " + compareArrays(a, c)); // false
        System.out.println("compareArrays(a, d): " + compareArrays(a, d)); // false
        System.out.println("compareArrays(a, e): " + compareArrays(a, e)); // true
        System.out.println("compareArrays(e, a): " + compareArrays(e, a)); // true
        System.out.println("compareArrays(a, a): " + compareArrays(a, a)); // true
    }
}
