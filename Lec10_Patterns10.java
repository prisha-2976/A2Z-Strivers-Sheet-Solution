public class Lec10_Patterns10 {
        public static void nStarTriangle(int n) {
            // Write your code here
            int st=1;
            int sp=n-1;
            for(int i=0;i<n;i++){
                for(int j=0;j<st;j++){
                    System.out.print("*");
                }
                for(int k=0;k<sp;k++){
                    System.out.print(" ");
                }
                System.out.println();
                st++;
                sp--;
    
            }
            sp=1;
            st=n-1;
            for(int x=0;x<n-1;x++){
                for(int l=0;l<st;l++){
                    System.out.print("*");
                }
                for(int m=0;m<sp;m++){
                    System.out.print(" ");
                }
                System.out.println();
                st--;
                sp++;
    
            }
        }
    }
    

