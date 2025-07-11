public class Lec2_Patterns12 {
    public static void numberCrown(int n) {
        // Write your code here.
          int sp = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int k = 1; k <= sp; k++) {
                System.out.print("  ");
            }

            for (int l = i; l >= 1; l--) {
                System.out.print(l + " ");
            }

            sp -= 2;
            System.out.println();

        }
    }
}
    

