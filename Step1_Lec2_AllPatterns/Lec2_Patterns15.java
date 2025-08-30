package Step1_Lec2_AllPatterns;
public class Lec2_Patterns15 {
     public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");

            }
            System.out.println();
        }
    }
}
    

