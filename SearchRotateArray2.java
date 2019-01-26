class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                if (nums[start] < target) {
                    start++;
                    end = mid - 1;
                } else if (nums[start] > target) {
                    if (nums[end] > target) {
                        end--;
                    } else if (nums[end] < target) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else if (nums[mid] < target) {
                if (nums[end] > target) {
                    start = mid + 1;
                    end--;
                } else if (nums[end] < target) {
                    if (nums[start] > target) {
                        return false;
                    } else if (nums[start] < target) {
                        start++;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
