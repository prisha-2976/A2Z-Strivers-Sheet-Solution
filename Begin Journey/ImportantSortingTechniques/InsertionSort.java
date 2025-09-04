package ImportantSortingTechniques;

public class InsertionSort {
    void insertionSort(int[] arr) {
        int n = arr.length;
          for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        }
    

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {12, 11, 13, 5, 6};
        is.insertionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// Recursion way
/* 
void insertionSortRecursive(int[] arr, int n) {
    // Base case: If the array size is 1 or less, it's already sorted
    if (n <= 1) { // N==0
        return;
    }

    // Sort the first n-1 elements
    insertionSortRecursive(arr, n - 1);
    int j=n;

   

    // Move elements of arr[0..n-1], that are greater than last,
    // to one position ahead of their current position
    while (j > 0 && arr[j-1] > arr[j]) {
       int temp = arr[j - 1];
       arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
    }
   
}
// Can't reduce space below O(n) unless you go iterative
// Time Complexity: O(N^2)- average and worst case, O(N)- best case
// Space Complexity: O(N) due to call stack space. */