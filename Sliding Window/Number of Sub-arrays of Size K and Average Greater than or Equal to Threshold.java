class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0,count=0,t=k*threshold;
        for(int i=0;i<arr.length;i++){
            c+=arr[i];
            if(i==k-1)if(c>=t)count++;
            if(i<k)continue;
            c-=arr[i-k];
            if(c>=t)count++;
        }
        return count;
    }
}
