class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j){
            int a=numbers[i];
            int b=numbers[j];
            if(a+b==target){
                return new int[] {i+1,j+1};
            }
            else if(a+b>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[] {-1,-1};
    }
}
