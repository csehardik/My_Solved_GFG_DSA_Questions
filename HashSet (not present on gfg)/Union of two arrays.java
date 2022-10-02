class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        
        HashSet <Integer> set = new HashSet<>();
        for(int x:a){
            set.add(x);
        }
        for(int x:b){
            set.add(x);
        }
        return set.size();
        
        
    }
}
