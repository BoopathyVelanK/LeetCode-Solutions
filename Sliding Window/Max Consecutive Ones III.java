class Solution {
    public int longestOnes(int[] n, int k) {
        int j=0,max=0,r=0,c=0;
        for(int i=0;i<n.length;i++){
            if(n[i]==0)r++;
            c++;
            while(r>k){
                if(n[j++]==0)r--;
                c--;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}
