class Solution{
    public int knapSack(int N, int capacity, int val[], int wt[])
    {
        int dp[][] = new int [N][capacity+1];
        for(int i=0;i<N;i++)
        for(int j=0;j<capacity+1;j++)
        dp[i][j]=-1;
        return maxProfit(wt,val,capacity,0,N,new HashMap<String,Integer>(),dp);
    }
    private int maxProfit(int wt[],int val[],int capacity,int currentItem,int N,HashMap<String,Integer>memo,int dp[][]){
        
        if(capacity==0)
        return 0;
        
        if(currentItem==N)
        return 0;
        
        int currentItemweight = wt[currentItem];
        int currentItemprofit = val[currentItem];
        
        int consider = 0;
        
        // String currentKey = Integer.toString(capacity) + '-' + Integer.toString(currentItem);
        
        // if(memo.containsKey(currentKey))
        // return memo.get(currentKey);
        
        if(dp[currentItem][capacity] != -1)
        return dp[capacity][currentItem];
        
        if(currentItemweight <= capacity)
        consider = currentItemprofit + maxProfit(wt,val,currentItem,capacity - currentItemweight,N,memo,dp);
        
        int notConsider = maxProfit(wt,val,currentItem+1,capacity,N,memo,dp);
        
        // memo.put(currentKey,Math.max(consider,notConsider));
        // return memo.get(currentKey);
        
        dp[currentItem][capacity] = Math.max(consider,notConsider);
        return dp[currentItem][capacity];
    }
}
