class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");

        StringBuilder c = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            c.append(str[i]).append(" ");
        }

        return c.toString().trim();
    }
}