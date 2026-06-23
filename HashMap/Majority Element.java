class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> a=new HashMap<>();
        int m=0,v=0;
        for(int i=0;i<n;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        for(int k:a.keySet()){
            if(a.get(k)>m){
                m=a.get(k);
                v=k;
            }
        }
        return v;
    }
}
