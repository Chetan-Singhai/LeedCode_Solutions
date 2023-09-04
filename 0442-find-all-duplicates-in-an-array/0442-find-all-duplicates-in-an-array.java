class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList <Integer> list =new ArrayList <Integer> ();
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
               list.add(nums[index]);
            }
        }
        return list ;
    }
}