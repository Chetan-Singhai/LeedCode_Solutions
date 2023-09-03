class Solution {
    public int maxProduct(int[] nums) {
        int currProduct =1;
        int maxProduct =Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currProduct = currProduct*nums[i];
            if (currProduct > maxProduct){
                maxProduct=currProduct;
            }
            if (currProduct == 0){
                currProduct = 1;
            }
        }
         currProduct =1;
        for(int i=nums.length-1; i>=0; i--){
            currProduct = currProduct*nums[i];
            if (currProduct > maxProduct){
                maxProduct=currProduct;
            }
            if (currProduct == 0){
                currProduct = 1;
            }

        }return maxProduct;
    }
}