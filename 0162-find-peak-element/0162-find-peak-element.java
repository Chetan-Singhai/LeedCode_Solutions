class Solution {
    public int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid]> nums[mid+1]){
                //you are in dec part of arr
                //this may we ans but look at left
                end = mid;
            }else{
                //you are in ase part of arr
                start = mid +1;
            }
        }
        return start; // return start and and any because both are same
    }
}