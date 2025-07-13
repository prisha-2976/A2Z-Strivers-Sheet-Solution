public class Lec_Patterns17 {
    public static void alphaHill(int n) {
        // Write your code here
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            
        
            char ch = 'A';
            for(int j=0;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }

           
            ch -= 2; 
            for(int j=0;j<i;j++){
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }

   
    }


    

