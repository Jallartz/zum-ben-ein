package h3;

public class H3_main {

    // Geforderte Methode
    public static boolean compareArraysVal(int[] a, int[] b) {

        // Wenn die Arrays unterschiedlich lang sind → unmöglich gleiche Häufigkeit
        if (a.length != b.length) {
            return false;
        }

        // Für jedes Element in a prüfen, ob es in b genauso oft vorkommt
        for (int i = 0; i < a.length; i++) {
            int value = a[i];

            int countA = countValue(a, value);
            int countB = countValue(b, value);

            if (countA != countB) {
                return false;
            }
        }

        return true; // Alle Werte kommen gleich oft vor
    }

    // Hilfsmethode: zählt, wie oft "value" im Array enthalten ist
    private static int countValue(int[] arr, int value) {
        int count = 0;
        for (int n : arr) {
            if (n == value) {
                count++;
            }
        }
        return count;
    }

    // Test-Main
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};
        int[] e = {1, 2, 3};
        int[] f = {1, 1, 2};

        System.out.println("compareArraysVal(a, b): " + compareArraysVal(a, b)); // false
        System.out.println("compareArraysVal(a, c): " + compareArraysVal(a, c)); // true
        System.out.println("compareArraysVal(a, d): " + compareArraysVal(a, d)); // false
        System.out.println("compareArraysVal(a, e): " + compareArraysVal(a, e)); // true
        System.out.println("compareArraysVal(c, e): " + compareArraysVal(c, e)); // true
        System.out.println("compareArraysVal(a, f): " + compareArraysVal(a, f)); // false
        System.out.println("compareArraysVal(f, f): " + compareArraysVal(f, f)); // true
    }
}
