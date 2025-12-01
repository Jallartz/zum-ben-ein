package h1;

public class H1_main {

    // Geforderte Methode
    public static boolean isMirrorArray(int[] a, int[] b) {
        // Wenn die Arrays unterschiedlich lang sind → nicht spiegelbildlich
        if (a.length != b.length) {
            return false;
        }

        // Elemente spiegelbildlich vergleichen
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[b.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    // Test-Main-Methode
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        int[] c = {2, 4, 6};
        int[] d = {6, 4, 9};

        System.out.println("isMirrorArray(a, b): " + isMirrorArray(a, b)); // true
        System.out.println("isMirrorArray(b, a): " + isMirrorArray(b, a)); // true
        System.out.println("isMirrorArray(a, c): " + isMirrorArray(a, c)); // false
        System.out.println("isMirrorArray(c, d): " + isMirrorArray(c, d)); // false
    }
}
