class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);        
        int n = 1;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0){
                // negative number, skip it
                continue;
            }
            else if(nums[i] == n){
                if(i+1 < nums.length && nums[i+1] == nums[i]) {
                    // check for multiples of the same integer                
                    continue;
                }
                else {
                    n++;
                }
            }
            else {
                return n;
            }
        }
        
        return n;
    }
}