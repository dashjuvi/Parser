class Solution {
    public int search(int[] nums, int target) {
        return find(0, nums.length-1, nums, target);
    }
    
    int find(int start, int end, int[] arr, int element) {
        if(end < start) return -1;
        if(start == end) {
            return arr[start] == element ? start : -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == element) return mid;
        if(arr[mid] < arr[end]) {
            if(arr[mid] <= element && element <= arr[end]) {
                return find(mid+1, end, arr, element);
            }else{
                return find(start, mid-1, arr, element);
            }
        } else {
            if(element > arr[end] && element < arr[mid]) {
                return find(start, mid-1, arr, element);
            }else{
                return find(mid+1, end, arr, element);
            }
        }
    }
}
