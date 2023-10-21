class Solution {
    public int[] searchRange(int[] nums, int target) {
        //  int first = -1, last = -1;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == target) {
        //         if (first == -1) {
        //             first = i;
        //         }
        //         last = i;
        //     }
        // }
        // return new int[]{first, last};
        int arr[] =new int[]{-1,-1};
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) { // Use <= to handle the case when start and end meet
            int mid = start + (end - start) / 2; // Calculate the mid index correctly

            if (nums[mid] == target) {
                arr[0] = mid;
                end = mid - 1;
            } 
            else if (nums[mid] > target) {
                end = mid - 1;

              }
              else {
                start = mid + 1;
            }
        }

        start = 0;
         end = nums.length - 1;
        
        while (start <= end) { // Use <= to handle the case when start and end meet
            int mid = start + (end - start) / 2; // Calculate the mid index correctly

            if (nums[mid] == target) {
                arr[1] = mid;
                start = mid + 1;
            } 
            else if (nums[mid] > target) {
                end = mid - 1;

              }
              else {
                start = mid + 1;
            }
        }
        return arr ;
    }
}