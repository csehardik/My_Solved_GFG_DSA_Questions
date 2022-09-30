class Solution
{
    //Function to find the nth catalan number.
    public BigInteger findCatalan(int n)
    {

        return catalanNumber(n,new HashMap<Integer,BigInteger>());
    }
    private BigInteger catalanNumber(int n,HashMap<Integer,BigInteger>memo){
        
        if(n==0 || n==1)
        return BigInteger.ONE;
        
        BigInteger ways = BigInteger.ZERO;
        
        int currentKey = n;
        
        if(memo.containsKey(currentKey))
        return memo.get(currentKey);
        
        for(int i=0;i<n;i++){
            BigInteger a = catalanNumber(i,memo);
            BigInteger b = catalanNumber(n-i-1,memo);
            BigInteger c = a.multiply(b);
            ways = ways.add(c);
        }
        
        memo.put(currentKey,ways);
        return memo.get(currentKey);
        
    }
}
