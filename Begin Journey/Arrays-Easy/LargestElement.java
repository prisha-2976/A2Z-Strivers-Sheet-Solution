public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};
        int largest = findLargest(numbers);
        System.out.println("The largest element is: " + largest);
    }

    public static int findLargest(int[] arr) {
        int n=arr.length;
        int max=arr[0];
        
        for(int i=1;i<n; i++){
    
                if(arr[i]>max){
                    max=arr[i];
                }
        
            }
            return max;
            


        }
       
    }
    // above code was recursive approach 
    // time complexity: O(n)
    // space complexity: O(1)
    /*
import java.util.Arrays;
class LargestElement {
  public static void main(String args[]) {
 
    int arr1[] =  {2,5,1,3,0};
    System.out.println("The Largest element in the array is: " + sort(arr1));
   
    int arr2[] =  {8,10,5,7,9};
    System.out.println("The Largest element in the array is: " + sort(arr2));
  }
  static int sort(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }
}
     
    time complexity: O(nlogn) due to sorting
    space complexity: O(n)
    */

    

