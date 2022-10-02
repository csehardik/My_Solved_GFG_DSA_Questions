// In this Question we are asked to find the count of all the subarrays having zero(0) sum.

import java.util.* ;
import java.io.*; 

public class Solution {

	public static int countSubarrays(int n, int[] arr) {
		HashMap<Integer,Integer>memo = new HashMap<Integer,Integer>();
        
        int prefixSum=0;
        int answer = 0;
        
        memo.put(prefixSum,1);
        
        for(int i = 0;i<n;i++){
            prefixSum+=arr[i];
            
            if(memo.containsKey(prefixSum)){
                answer+=memo.get(prefixSum);
            memo.put(prefixSum,memo.get(prefixSum)+1);
            }else{
                memo.put(prefixSum,1);
            }
        }
        return answer;
	}

}
