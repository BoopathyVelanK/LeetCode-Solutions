class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0,t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                t++;
            }
            else{
                m=(m<=t)?t:m;
                t=0;
            }
        }
        m=(m<=t)?t:m;
        return m;
    }
}
