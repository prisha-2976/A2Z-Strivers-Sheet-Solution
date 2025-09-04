package ImportantSortingTechniques;

import java.util.List;

public class QuickSort{
    static int partition(List<Integer> arr, int low, int high){
        int pivot=arr.get(low);
        int i=low;
        int j=high;
        while(i<j){
            while(arr.get(i)<=pivot && i<=high-1){
                i++;
            }
            while(arr.get(j)>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }
        int temp=arr.get(low);
        arr.set(low,arr.get(j));
        arr.set(j,temp);
        return j;

        
    }
     static void qs(List<Integer> arr, int low, int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            qs(arr,pivot-1,low);
            qs(arr,pivot+1,high);
        }
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here.
        qs(arr, 0, arr.size() - 1);
        return arr;
    }

}
// Time Complexity: O(N log N) on average and O(N^2) in the worst case
// Time Complexity: O(N*logN), where N = size of the array.

// Reason: At each step, we divide the whole array, for that logN and n steps are taken for partition() function, so overall time complexity will be N*logN.
// Worst Case Time complexity: O(n2) --if the partition is done and the last element is the pivot, even the array is sorted then the worst case would be either in the increasing order of the array or in the decreasing order of the array. 

/*Best Case – This case occurs when the pivot is the middle element or near to middle element of the array.
Recurrence :
F(n) = 2F(n/2)

Time Complexity for the best and average case: O(N*logN)
*/
/*“Quick Sort’s time complexity is O(n log n) in average and best cases, but degrades to O(n²) when the pivot leads to unbalanced partitions — such as when sorting already sorted arrays with a fixed pivot strategy. Space complexity follows suit: O(log n) for balanced recursion, O(n) for skewed.” */