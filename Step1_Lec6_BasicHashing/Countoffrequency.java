package Step1_Lec6_BasicHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Countoffrequency {
        public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        for(Map.Entry<Integer,Integer> set:map.entrySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(set.getKey());
            temp.add(set.getValue());
            result.add(temp);
        }
        return result;
        
    }
}
/* Another Method
 * class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        int Maxfreq=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            
            int count=entry.getValue();
            if(count>Maxfreq){
                Maxfreq=count;
            }
    
        }
         int sum=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            
            int count=entry.getValue();
            if(count==Maxfreq){
                sum+=count;
            }
    
        }
        return sum;
        
    }
}
 */
/* Another Method for Sum of count frequency of maximum frequency elements
 * class Solution {
    public int maxFrequencyElements(int[] nums) {
    Map<Integer, Integer> freqMap = new HashMap<>();
    int maxFreq = 0;
    int sumMaxFreq = 0;

    for (int num : nums) {
        int freq = freqMap.getOrDefault(num, 0) + 1;
        freqMap.put(num, freq);

        if (freq > maxFreq) {
            maxFreq = freq;
            sumMaxFreq = freq;
        } else if (freq == maxFreq) {
            sumMaxFreq += freq;
        }
    }


      return sumMaxFreq;  
        
    }
}
 */
/*
 * Using Naive approach without using HashMap
 * class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101]; // nums[i] ∈ [1, 100]
        int maxFreq = 0;

        // Count frequencies and track max frequency
        for (int num : nums) {
            freq[num]++;
            if (freq[num] > maxFreq) {
                maxFreq = freq[num];
            }
        }

        // Sum frequencies equal to max frequency
        int sum = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                sum += f;
            }
        }

        return sum;
    }
}
 */
    

