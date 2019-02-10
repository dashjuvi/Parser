class Solution {
    public int subarraySum(int[] nums, int k) {
        int c;
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                c++;
                if(i==len)return c;
            }
            map.put(target-nums[i],i)
        }return c;
    }return 0;
}
