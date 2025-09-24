import java.util.Arrays;

public class SecondLargestElement {
    // if there is no restriction to sort or not sort we can sort array and return second last element
    class Solution {
    public int getSecondLargest(int[] arr) {
        // code here

        if (arr == null || arr.length < 2) return -1;

        Arrays.sort(arr); 
        int max = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < max) {
                return arr[i];
            }
        }

        return -1; 
    }
}
    // Time complexity: O(n log n) due to sorting
    // Space complexity: O(1) if sorting in place, otherwise O(n)
}
/*
 * Another approach without sorting: and find first second smallest ele and last second largest element
 * Time complexity: O(n)
 * Space complexity: O(1)
 static private int secondSmallest(int[] arr, int n)
{
	if (n < 2)
	{
		return -1;
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
	   if (arr[i] < small)
	   {
		  second_small = small;
		  small = arr[i];
	   }
	   else if (arr[i] < second_small && arr[i] != small)
	   {
		  second_small = arr[i];
	   }
	}
   return second_small;
}
static private int secondLargest(int[] arr, int n)
{
	if(n<2)
	return -1;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
		if (arr[i] > large)
		{
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}
	return second_large;
}

public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 7, 7, 5};
	int n = arr.length;
		int sS = secondSmallest(arr, n);
		int sL = secondLargest(arr, n);
	System.out.println("Second smallest is "+sS);
	System.out.println("Second largest is "+sL);
}

}
 */
