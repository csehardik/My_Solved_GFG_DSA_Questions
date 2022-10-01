class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer>memo= new HashMap<Integer,Integer>();
        int answer=0;
        int prefixSum=0;
        
        memo.put(prefixSum,-1);
        
        for(int i=0; i<n;i++){
            prefixSum+=arr[i];
        if(memo.containsKey(prefixSum))
        answer = Math.max(answer,i-memo.get(prefixSum));
        else
        memo.put(prefixSum,i);
        }
        return answer;
    }
}
