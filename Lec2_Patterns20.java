public class Lec2_Patterns20 {
      public static void symmetry(int n) {
        // Write your code here
        int sp = 2 * n - 2;

        // Top half
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("*"+" ");
            for (int k = 0; k < sp; k++) System.out.print(" "+" ");
            for (int j = 0; j < i; j++) System.out.print("*"+" ");
            sp -= 2;
            System.out.println();
        
        }
        // Bottom half
        sp = 2;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) System.out.print("*"+" ");
            for (int k = 0; k < sp; k++) System.out.print(" "+" ");
            for (int j = 0; j < i; j++) System.out.print("*"+" ");
            sp += 2;
            System.out.println();
        }
    }

    }
    

