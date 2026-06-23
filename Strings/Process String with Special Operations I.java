class Solution {
    public String processStr(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='*' && str.length()>0){
                str.deleteCharAt(str.length()- 1);
            }
            else if(a=='#'){
                str.append(str);
            }
            else if(a=='%'){
                str=str.reverse();
            }
            else if(a>='a' && a<='z'){
                str.append(a);
            }
        }
        return str.toString();

    }
}
