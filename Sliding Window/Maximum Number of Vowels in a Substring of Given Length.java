class Solution {
    public int maxVowels(String s, int k) {
        int co=0,max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')co++;
            if(i==k-1)max=co;
            if(i<k)continue;
            char ch=s.charAt(i-k);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')co--;
            max=Math.max(co,max);
            }
        return max;
    }
}
