class Solution {
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        int sum;
        int aux;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        for(int i=0;i<len;i++){
            if(i != 0) aux+=nums[i-1];
            if(sum - aux - nums[i] == aux) return i;
        }
    }return -1;
}
