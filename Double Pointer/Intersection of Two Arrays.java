class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        HashSet<Integer> a = new HashSet<>();
        while (i < nums1.length) {
            int n = nums1[i];
            j = 0;
            while (j < nums2.length) {
                if (n == nums2[j]) {
                    a.add(n);
                    break;
                }
                j++;
            }
            i++;
        }
        int[] ar = new int[a.size()];
        int b = 0;
        for (int l : a)
            ar[b++] = l;
        return ar;
    }
}
