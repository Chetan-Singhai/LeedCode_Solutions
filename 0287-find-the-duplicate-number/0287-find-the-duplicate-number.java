class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length ){
            int correct_index = nums[i]-1;
            if(nums[i] != nums[correct_index]){
                int tamp = nums[i];
                nums[i] =nums[correct_index];
                nums[correct_index]=tamp;
            }
            else{
                 i++;
            }
        }
        for(int index=0; index < nums.length; index++){
            if(nums[index] != index+1){
                return nums[index];
            }
        }
        return nums.length;
    }
}