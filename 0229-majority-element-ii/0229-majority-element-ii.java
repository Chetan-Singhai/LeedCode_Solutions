class Solution {
    public List<Integer> majorityElement(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
         ArrayList<Integer> key = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
             map.put(nums[i],map.getOrDefault(nums[i], 0)+1 );
        }
            // Set<Integer>getKey= map.keySet();
            for ( int keySet : map.keySet())  {                        
                if (map.get(keySet) > nums.length / 3) {
                          key.add(keySet);
                }
            }return key;
        } 
    }
    
    