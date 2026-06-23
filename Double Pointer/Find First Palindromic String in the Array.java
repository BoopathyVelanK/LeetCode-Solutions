class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            int i=0,j=s.length()-1;
            boolean isit=false;
            while(i<=j){
                if(s.charAt(i++)!=s.charAt(j--)){
                    isit=true;
                    break;
                }
            }
            if(!(isit)){
                return s;
            }
        }
        return "";
    }
}
