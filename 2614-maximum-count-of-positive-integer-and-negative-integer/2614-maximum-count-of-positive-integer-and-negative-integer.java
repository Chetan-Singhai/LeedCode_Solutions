class Solution {
    public int maximumCount(int[] nums) {
        int pc = 0;
        int nc = 0;
        for( int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                nc++;
            }else if(nums[i] > 0){
                pc++;
            }
        }
         int max = Math.max(pc,nc);
        return max;
        
    }
}