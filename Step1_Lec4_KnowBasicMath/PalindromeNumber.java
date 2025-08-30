package Step1_Lec4_KnowBasicMath;

/* Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            return x==reversed(x);
        }
        
    }
    private int reversed(int x){
        int rev=0;
        while(x!=0){
        int lastdigit=x%10;
        if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10){
            return 0;
        }
        rev=(rev*10)+lastdigit;
        x=x/10;
    }
    return rev;

        
    }
}
    

