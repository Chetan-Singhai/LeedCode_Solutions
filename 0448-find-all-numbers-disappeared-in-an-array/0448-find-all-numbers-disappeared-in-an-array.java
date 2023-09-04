class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>list=new ArrayList<Integer>();
       
       int i=0;
       while(i<nums.length){
        int currect_index = nums[i]-1;
        if(  nums[i]!= nums[currect_index]){
            int temp=nums[i];
            nums[i]=nums[currect_index];
           nums[currect_index]=temp;
    }else{
        i++;
    }
}     
    for(int index=0; index < nums.length; index++){
        if (nums[index] != index+1){
            list.add(index+1);
        
        }
        
    }return list;
        }
        
    }
