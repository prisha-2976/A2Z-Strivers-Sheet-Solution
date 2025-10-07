public class Removeduplicates {
    // optimal-two pointers
    static int removeDuplicates(int[] arr){
        int i=0;
    
        for(int j=1;i<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
      
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5};
        int n=arr.length;
        int k=removeDuplicates(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");   
       
        }
    }
    
}
// tc: O(n)
// sc: O(1)
/*
//  BY HASHSET
  public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }
}

 */
