class Solution {
    public String reverseVowels(String s) {
        char[] str=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<=j){
            char a=Character.toLowerCase(str[i]);
            char b=Character.toLowerCase(str[j]);
            int t=0;
            if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u' )t++;
            else i++;
            if(b=='a'|| b=='e' || b=='i' || b=='o' || b=='u' )t++;
            else j--;

            if(t==2){
                char x=str[i];
                str[i]=str[j];
                str[j]=x;
                i++;
                j--;
            }
            
        }
        return new String(str);
    }
}
