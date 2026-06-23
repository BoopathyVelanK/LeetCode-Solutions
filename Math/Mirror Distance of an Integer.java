class Solution {
    public int mirrorDistance(int n) {
        int m=0,c=n;
        while(c>0){
            m=(m*10 + (c%10));
            c/=10;
        }
        return Math.abs(n-m);
    }
}
