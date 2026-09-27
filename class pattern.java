 class Pattern {
    public static void main(String[] args) {

        // n stores the number of rows to be printed
        int n = 5;

        // Pattern 1: Right-Angled Triangle
        System.out.println("1. Right-Angled Triangle Pattern");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 2: Inverted Right-Angled Triangle
        System.out.println("\n2. Inverted Right-Angled Triangle Pattern");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 3: Square
        System.out.println("\n3. Square Pattern");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 4: Pyramid
        System.out.println("\n4. Pyramid Pattern");

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Pattern 5: Inverted Pyramid
        System.out.println("\n5. Inverted Pyramid Pattern");

        for (int i = n; i >= 1; i--) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}