public class Lec2_Patterns19 {
     public static void symmetry(int n) {
           int sp=0;
        for(int i=0;i<n;i++){
           // stars
        for(int j=1;j<=n-i;j++){
            System.out.print("*"+" ");
        } 
        
        // space
        for(int k=0;k<sp;k++){
            System.out.print(" "+" ");
        }
        // stars
        for(int l=1;l<=n-i;l++){
            System.out.print("*"+" ");

        }
        sp=sp+2;
        System.out.println();
        }
        int sp1=2*n-2;
        for(int a=1;a<=n;a++){
            for(int b=0;b<a;b++){
                System.out.print("*"+" ");
            }
            for(int c=0;c<sp1;c++){
                System.out.print( " "+" ");            
            }
            for(int b=0;b<a;b++){
                System.out.print("*"+" ");
            }
            sp1=sp1-2;
            System.out.println();

        }
    }
}
    

