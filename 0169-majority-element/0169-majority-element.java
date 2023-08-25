class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // if (map.containsKey(arr[i])) {
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            //     map.put(arr[i], 1);
            // }

             map.put(nums[i],map.getOrDefault(nums[i], 0)+1 );

            // Set<Integer>getKey= map.keySet();
            for (int keySet : map.keySet()) {
                if (map.get(keySet) > nums.length / 2) {
                          return keySet;
                }
            }
        } return -1;
    }
    }
