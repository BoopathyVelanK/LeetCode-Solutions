class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> a=new HashSet<>();
        long c=0,max=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            while(a.contains(nums[i]) ){
                a.remove(nums[l]);
                c-=(long)nums[l];
                l++;
            }
            a.add(nums[i]);
            c+=(long)nums[i];
            
            while(i-l+1>k){
                a.remove(nums[l]);
                c-=(long)nums[l];
                l++;
            }
            if(i-l+1==k)
            max=Math.max(c,max);
        }
        return max;
    }
}
