package Step1_Lec2_AllPatterns;
/*Problem statement
Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.

Example:
Input: ‘N’ = 3

Output: 

1 2 3
1 2
1
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
1 2 3
1 2
1
Sample Input 2 :
4
Sample Output 2 :
1 2 3 4
1 2 3
1 2
1
Sample Input 3 :
7
Sample Output 3 :
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1

*/

public class Lec2_Patterns6 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j+1+" ");
                

            

            }
            System.out.println();
        }
    }
}

    

