class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set answer = new HashSet();
        
        for(int i : nums) {
            if (answer.contains(i)){
                return true;
            }
            answer.add(i);
        }        
        return false;       
    }
}