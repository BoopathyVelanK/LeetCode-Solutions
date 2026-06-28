class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c=0,min=0;
        for(int i=0;i<blocks.length();i++){
            char ch=blocks.charAt(i);
            if(ch=='W')c++;
            if(i==k-1)min=c;
            if(i<k)continue;
            if(blocks.charAt(i-k)=='W')c--;
            min=Math.min(c,min);
        }
        return min;
    }
}
