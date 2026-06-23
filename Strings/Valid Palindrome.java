class Solution {
    public boolean isPalindrome(String s) {
        String a=s.replaceAll("[^A-Za-z0-9]","");
        StringBuilder str=new StringBuilder(a);
        String a1=str.reverse().toString();
        a=a.toLowerCase();
        a1=a1.toLowerCase();
        System.out.print(a1 +" "+a);
        return a1.matches(a);
    }
}
