public class Lec8_Patterns8 {
        public static void nStarTriangle(int n) {
            // Write your code here
          for (int i = 0; i < n; i++) {
                
                for (int sp = 0; sp < i; sp++) {
                    System.out.print(" ");
                }
        
                for (int st = 0; st < 2 * (n - i) - 1; st++) {
                    System.out.print("*");
                }
                
                System.out.println();
            }
        }
    }
    
