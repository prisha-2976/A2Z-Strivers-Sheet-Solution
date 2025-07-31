package Step1_Lec4_KnowBasicMath;
/*public class Given two positive integers a and b, find GCD of a and b.

Note: Don't use the inbuilt gcd function

Examples:

Input: a = 20, b = 28
Output: 4
Explanation: GCD of 20 and 28 is 4
Input: a = 60, b = 36
Output: 12
Explanation: GCD of 60 and 36 is 12
Constraints:
1 ≤ a, b ≤ 109 
T.C - O(LOG(MIN(A,B) or o(min(a,b))
s.C- O(1)
*/

public class GCD_or_HCF {
    public static int gcd(int a, int b) {
        // code here
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }else{
            return a;
        }
    }
}
    

