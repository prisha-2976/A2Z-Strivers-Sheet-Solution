package Step1_Lec2_AllPatterns;
/* Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****
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
Explanation Of Sample Input 1 :
The first row contains two spaces, followed by a star.
The second row contains one space, followed by three stars.
The third row contains five stars.
Sample Input 2 :
1
Sample Output 2 :
*
*/


public class Lec2_Patterns7 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0; i < n; i++) {
    for(int sp = 0; sp < n - i - 1; sp++) {
        System.out.print(" ");
    }
    
    for(int st = 0; st < 2 * i + 1; st++) {
        System.out.print("*");
    }
    System.out.println();
}

        }
    }

    

