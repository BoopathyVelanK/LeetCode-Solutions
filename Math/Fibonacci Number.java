class Solution {
    public int fib(int n) {
        if(n==0)return n;
        int f0=0,f1=1;
        for(int i=1;i<n;i++){
            int sum=f0+f1;
            f0=f1;
            f1=sum;
        }
        return f1;
    }
}
