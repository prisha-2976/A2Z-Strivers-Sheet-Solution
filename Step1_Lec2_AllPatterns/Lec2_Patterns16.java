package Step1_Lec2_AllPatterns;
public class Lec2_Patterns16 {
     public static void alphaRamp(int n) {
        char start='A';
        // Write your code here
        for(int i=0;i<n;i++){
            
            for(char j=0;j<=i;j++){
                System.out.print(start+" ");
               
                
            }
            start++;
            System.out.println();
        }
    }
}
    

