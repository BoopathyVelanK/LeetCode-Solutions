class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        if(k>s2.length())return false;
        int[] f=new int[26];
        int[] e=new int[26];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            f[c-'a']++;
        }
        
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            e[c-'a']++;
            if(i==k-1)if(Arrays.equals(f,e))return true;
            if(i<k)continue;
            e[(s2.charAt(i-k))-'a']--;
            if(Arrays.equals(f,e))return true;
        }
        return false;
    }
}