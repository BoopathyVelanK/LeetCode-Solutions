
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> index=new ArrayList<>();
        int[] a=new int[26];
        int[] b=new int[26];
        int k=p.length();
        for(int i=0;i<p.length();i++)a[p.charAt(i)-'a']++;

        for(int i=0;i<s.length();i++){
            b[s.charAt(i)-'a']++;
            if(i==k-1)if(Arrays.equals(a,b))index.add(0);
            if(i<k)continue;
            b[s.charAt(i-k)-'a']--;
            if(Arrays.equals(a,b))index.add(i-k+1);
        }
        return index;
    }
}
