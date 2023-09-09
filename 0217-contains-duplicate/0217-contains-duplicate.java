class Solution {
    public boolean containsDuplicate(int[] nums) {  
        HashSet <Integer> list = new HashSet <Integer>();
       for (int num : nums){
            if(list.contains(num)){
                return true;
            }
           list.add(num);
        } 
            
       return false ; 
    }
}