class Solution {
    public int climbStairs(int n) {
        int f0=0,f1=1;
        for(int i=1;i<=n;i++){
            int f=f1+f0;
            f0=f1;
            f1=f;
        }
        return f1;
    }
}