import java.util.* ;
import java.io.*; 

// in this question we need to find the count of subarrays's having sum = 0
// in this we have HashMap entry as [key = prefixSum & value = Occurence(no. of thimes this prefixSum is coming)]

public class Solution {

	public static int countSubarrays(int n, int[] arr) {
		HashMap<Integer,Integer>memo = new HashMap<Integer,Integer>();// initialize a new empty HashMap of integer type [key : value] pair
        
        int prefixSum=0;
        int answer = 0;
        
        memo.put(prefixSum,1); // executing this line as to control some corner cases . and this line tells that value prefixSum = 0  has been encountered one time 
        
        for(int i = 0;i<n;i++){ // now we iterate over our nums array 
            prefixSum+=arr[i];// whatever value we encounter in the nums array we are adding that value to the prefixSum 
            
            if(memo.containsKey(prefixSum))// if this prefixSum is already present in the Map then 
            {
                answer+=memo.get(prefixSum);// we will increment the answer variable first i.e we will add in answer the no. of times this prefixSum is coming
            memo.put(prefixSum,memo.get(prefixSum)+1);// we will increment the count at every stage
                
            }else// if this value not present in the Map then,
            {
                memo.put(prefixSum,1);// create an entry of that number and place 1 indicating that this is the first occurence of this number/element
            }
        }
        return answer;
	}

}
