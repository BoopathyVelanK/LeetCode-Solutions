class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder str=new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<=j){
            char a=s.charAt(i);
            char b=s.charAt(j);
            if(Character.isLetter(a) && Character.isLetter(b)){
                str.setCharAt(i,b);
                str.setCharAt(j,a);
                i++;j--;
            }
            else if(Character.isLetter(a))j--;
            else i++;
        }
        return str.toString();
    }
}
