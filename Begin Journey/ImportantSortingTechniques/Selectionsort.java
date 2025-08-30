package ImportantSortingTechniques;
class Selectionsort {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                   
                }
            }
             swap(arr,i,min);
            
        }
    }
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    public static void main(String[] args) {
        Selectionsort ss = new Selectionsort();
        int[] arr = {64, 25, 12, 22, 11};
        ss.selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// Time Complexity: O(N^2)
// Space Complexity: O(1)