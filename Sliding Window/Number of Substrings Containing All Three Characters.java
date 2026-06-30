class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int l = 0;
        int total = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                total += n - i;
                count[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return total;
    }
}
