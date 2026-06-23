class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int d=0,l=0,r=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='_')d++;
            else if(moves.charAt(i)=='R')r++;
            else l++;
        }
        int n=Math.abs(l-r);
        return n+d;

    }
}
