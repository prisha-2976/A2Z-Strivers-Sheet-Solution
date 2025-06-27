public class Lec2_Patterns7 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0; i < n; i++) {
    // print spaces
    for(int sp = 0; sp < n - i - 1; sp++) {
        System.out.print(" ");
    }
    // print stars
    for(int st = 0; st < 2 * i + 1; st++) {
        System.out.print("*");
    }
    System.out.println();
}

        }
    }

    

