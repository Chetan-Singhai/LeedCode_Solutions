class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
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
               arr[0]=nums[index];
               arr[1]=index+1;
            }
        }
        return arr ;
    }
}