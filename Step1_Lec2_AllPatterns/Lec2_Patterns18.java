package Step1_Lec2_AllPatterns;
public class Lec2_Patterns18 {
     public static void alphaTriangle(int n) {
        // Write your code here
               char start = (char)('A' + n - 1); 
        for(int i=0;i<n;i++){
            char ch = start;
            for(int j=0;j<=i;j++){
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}
    

