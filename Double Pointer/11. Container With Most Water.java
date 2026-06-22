class Solution {
    public int maxArea(int[] h) {
        int i=0,max=0,j=h.length-1;
        while(i<=j){
            int k=Math.min(h[j],h[i])*(j-i);
            if(k>max)max=k;
            if(h[i]<=h[j])i++;
            else j--;
        }
        return max;
    }
}