package Step1_Lec2_AllPatterns;
/*  Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

Example:
Input: ‘N’ = 3

Output: 

*
**
***
**
*
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
*
**
***
**
*
Sample Input 2 :
1
Sample Output 2 :
*/

public class Lec2_Patterns10 {
        public static void StarTriangle(int n) {
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
    

