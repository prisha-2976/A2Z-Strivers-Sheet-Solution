package Step1_Lec6_BasicHashing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class high_low_Freq_Ele {


    public ArrayList<Integer> highLowFreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxFreq || (value == maxFreq && key > maxEle)) {
                maxFreq = value;
                maxEle = key;
            }
            if (value < minFreq || (value == minFreq && key < minEle)) {
                minFreq = value;
                minEle = key;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(maxEle);
        result.add(minEle);
        return result;
    }
}
    

    /* Another way to do it when only array in return is required
     * public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        int n=v.length;
        Map<Integer, Integer> freqMap = new HashMap<>();
         for (int num : v) {
        int freq = freqMap.getOrDefault(num, 0) + 1;
        freqMap.put(num, freq);
         }
        int maxC=0;
        int minC=Integer.MAX_VALUE;
        int maxE=Integer.MAX_VALUE;
        int minE=Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int count=entry.getValue();
            int element=entry.getKey();
          if (count > maxC || (count == maxC && element < maxE)) {
                maxE = element;
                maxC = count;
            }
            if (count < minC  || (count == minC && element < minE)) {
                minE = element;
                minC = count;
            }
        }
         return new int[]{maxE, minE};

        }
    }

     */
