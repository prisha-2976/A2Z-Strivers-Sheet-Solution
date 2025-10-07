public class CheckArraySorted {
    static boolean isSorted(int[] Arr, int n){
    for(int i=1;i<n;i++){
        if(Arr[i]<Arr[i-1])
            return false;
    }
        return true;
    }

    public static void main(String[] args) {
        int[] Arr={1,2,3,4,5};
        int n=Arr.length;
        System.out.println(isSorted(Arr,n));
    }
    
    
}

// time complexity: O(n)
// space complexity: O(1)

