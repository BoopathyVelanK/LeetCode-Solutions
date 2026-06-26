class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> a=new HashSet<>();
        int count=0,max=0,l=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(a.add(c)){
                count++;
                max=Math.max(max,count);
            }
            else{
                while(a.contains(c)){
                    a.remove(s.charAt(l++));
                    count--;
                }
                a.add(c);count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
