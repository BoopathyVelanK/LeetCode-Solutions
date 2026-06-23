class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=nums1.length-1;
        int i=n-1;
        while(i>=0){
            nums1[k--]=nums2[i--];
        }
        Arrays.sort(nums1);
    }
}
