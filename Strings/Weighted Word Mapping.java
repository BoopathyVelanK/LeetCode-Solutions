class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(String s:words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                int val=(int)c;
                sum+=weights[val-97];
            }
            sum=sum%26;
            char r=(char)('z'-sum);
            res.append(r);
        }

        return res.toString();
    }
}
