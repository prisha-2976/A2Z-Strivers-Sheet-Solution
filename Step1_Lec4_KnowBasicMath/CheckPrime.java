package Step1_Lec4_KnowBasicMath;
/* Given a number n, determine whether it is a prime number or not.
Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

Examples :

Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.
Input: n = 25
Output: false
Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.
Input: n = 1
Output: false
Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered prime.
Constraints:
1 ≤ n ≤ 109 */

public class CheckPrime {
    static boolean isPrime(int n) {
        // code here
        int count =0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            if(i!=n/i){
                count++;
            }
        }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}
    

