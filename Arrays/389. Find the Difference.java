class Solution {
    public char findTheDifference(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int i;
        for( i=0;i<b.length && i<a.length;i++){
            
            if(a[i]!=b[i]){
                return b[i];
            }
        }
        return b[i];
    }
}