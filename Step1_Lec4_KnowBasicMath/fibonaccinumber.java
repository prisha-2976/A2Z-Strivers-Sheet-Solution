package Step1_Lec4_KnowBasicMath;

public class fibonaccinumber {
    class Solution {
    public int fib(int n) {
        if(n<=0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int cur=0;
        int lastIndex=0;
        int last=1;
        System.out.print(lastIndex+last);
        for(int i=2;i<=n;i++){
             cur=lastIndex+last;
            lastIndex = last;
            last = cur;
       
        }
        return cur;
        
    }
}
    
}
