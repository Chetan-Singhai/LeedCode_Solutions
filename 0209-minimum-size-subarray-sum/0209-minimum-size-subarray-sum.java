class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int minSubArray = nums.length+1;
       int second=0; 
        long sum =0;
        int first=0;
       while ( first < nums.length) 
       {
           sum += nums[first];
           if( sum < target){
               first++;
            }
           else{
               while(second <=first && sum >= target)
               {
                     sum -= nums[second];
                     minSubArray = Math.min(minSubArray ,first-second+1);
                     second++;
               }
               first++;
               }
       }
          if( minSubArray == nums.length+1){
              return 0;
          }
          return minSubArray;
          
       }
    }
    
