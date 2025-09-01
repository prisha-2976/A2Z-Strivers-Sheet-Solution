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
