class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] a=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                a[i]=0;
                continue;
            }
            int st=i-1,e=i+1;
            while(st>=0 && s.charAt(st)!=c)st--;
            while(e<s.length() && s.charAt(e)!=c)e++;
            if(st<0){
                a[i]=e-i;
            }
            else if(e>=s.length()){
                a[i]=i-st;
            }
            else{
                a[i]=Math.min(Math.abs(st-i),Math.abs(e-i));
            }
        }
        return a;
    }
}
