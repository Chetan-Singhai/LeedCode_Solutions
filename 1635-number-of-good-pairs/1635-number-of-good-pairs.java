class Solution {
    public int numIdenticalPairs(int[] nums) {

        // int good_Pairs = 0;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //             if(nums[i] == nums[j] ){
        //                 good_Pairs++;
        //             }
        //     }
        // }
        // return good_Pairs;


        HashMap<Integer, Integer> count  = new HashMap<>();
        int good_Pairs = 0;
        for (int num : nums) {
            if (count.containsKey(num)) {
                good_Pairs += count.get(num);
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        return good_Pairs;
    }
}
      
       