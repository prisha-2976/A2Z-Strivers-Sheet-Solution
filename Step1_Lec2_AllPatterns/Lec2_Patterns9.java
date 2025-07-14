package Step1_Lec2_AllPatterns;
/*Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****
*****
 ***
  *
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
  *
 ***
*****
*****
 ***
  *    
Sample Input 2 :
1
Sample Output 2 :
*
*
*/



public class Lec2_Patterns9 {
        public static void nStarDiamond(int n) {
            // Write your code here
            
              int sp = n - 1;
            int st = 1;
    
            for(int i=0;i<n;i++){
                for(int j=0;j<sp;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<st;k++){
                    System.out.print("*");
                }
               
                System.out.println();
                sp--;
                st=st+2;
            }
            sp=0;
            st=n*2-1;
            for(int j=0;j<n;j++){
                for(int i=0;i<sp;i++){
                    System.out.print(" ");
                }
                for(int k=0;k<st;k++){
                    System.out.print("*");
                }
                System.out.println();
                sp++;
                st=st-2;
    
            }
            
        }
    }
    

