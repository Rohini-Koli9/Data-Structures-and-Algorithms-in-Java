public class SearchedInRotatedSortedArray {

    public static int searchedInRotatedSortedArray(int nums[], int target){
        int start = nums[0];
        int end  = nums.length-1;
        while(start < end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[start] <= nums[mid]) {
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }   else {
                    start = mid + 1;
                }         
            } else {
                if(target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return nums[start] == target ? start : -1;
    }
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(searchedInRotatedSortedArray(nums, 0));
    }
}
