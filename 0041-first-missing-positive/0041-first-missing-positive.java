class Solution {
    public int firstMissingPositive(int[] nums) {
         int i=0;
       while(i<nums.length){
        int currect_index = nums[i]-1;
        if( nums[i]>0 && nums[i]<=nums.length && nums[i]!= nums[currect_index]){
            int temp=nums[i];
            nums[i]=nums[currect_index];
           nums[currect_index]=temp;
      
    }else{
        i++;
    }
}     
    for(int index=0; index < nums.length; index++){
        if ( nums[index] != index+1){
            return index+1;
          
        } 
        
    }return nums.length+1;
    }
}