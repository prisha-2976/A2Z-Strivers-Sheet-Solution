package Step1_Lec2_AllPatterns;
public class Lec2_Patterns14 {
       public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
    

