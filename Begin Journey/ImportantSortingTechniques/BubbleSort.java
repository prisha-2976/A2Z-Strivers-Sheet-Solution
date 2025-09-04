package ImportantSortingTechniques;

public class BubbleSort {
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {  //for(int j=0;j<=n-2;j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bs.bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
// Time Complexity: O(N^2)
// Space Complexity: O(1)
// Recursive
/* 
void BubbleSortRecursive(int[] arr, int n) {
    // Base case: If the array size is 1 or less, it's already sorted
    if (n <= 1) {
        return;
    }

    // One pass of bubble sort. After this pass, the largest element is moved to the end.
    for (int i = 0; i <= n - 2; i++) {
        if (arr[i] > arr[i + 1]) {
            // Swap arr[i] and arr[i+1]
            swap(arr, i, i + 1);
        }
    }

    // Recursive call for the remaining array
    BubbleSortRecursive(arr, n - 1);
// }
// Space Complexity: O(N) due to call stack space.
// Time Complexity: O(N^2)*/
