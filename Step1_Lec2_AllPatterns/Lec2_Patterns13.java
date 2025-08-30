package Step1_Lec2_AllPatterns;
public class Lec2_Patterns13 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(cnt+1+" ");
                cnt++;
            }
            System.out.println();
        }
    }
}
    

