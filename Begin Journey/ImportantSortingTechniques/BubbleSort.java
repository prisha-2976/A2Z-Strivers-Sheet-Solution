package ImportantSortingTechniques;

public class BubbleSort {
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
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
