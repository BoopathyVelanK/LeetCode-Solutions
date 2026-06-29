class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String s:patterns){
            if(s.length()>word.length())continue;
            boolean isit=false;
            int index=word.indexOf(s);
            if(index!=-1)c++;
        }
        return c;
    }
}
