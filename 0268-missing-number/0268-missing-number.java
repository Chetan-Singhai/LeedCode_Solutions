class Solution {
    public int missingNumber(int[] nums) {
     int i=0;
    
    while(i<nums.length){
        int currect_index = nums[i];
        if( nums[i]< nums.length && nums[i]!= nums[currect_index]){
            int temp=nums[i];
            nums[i]=nums[currect_index];
           nums[currect_index]=temp;
    }else{
        i++;
    }
}     
    for(int index=0; index<nums.length; index++)
        if (index!= nums[index]){
            return index;
        }
        return nums.length;
    }
        }