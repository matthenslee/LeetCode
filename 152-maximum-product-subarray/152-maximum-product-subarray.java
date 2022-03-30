class Solution {
    public int maxProduct(int[] nums) {
        
        // initalize output to first item in list
        // could be any valid integer based on input
        // requirements
        int output = nums[0];
         
        
        // bail if we have an empty array
        if(nums.length == 0)
            return 0;
        
        // loop through input array while sliding
        // to the next value in the array
        for(int i = 0; i < nums.length; i++) {
            int currentProduct = 1;  
            for(int j = i; j < nums.length; j++) {
                currentProduct *= nums[j];
                output = Math.max(currentProduct, output);
            }
            
        }            
        return output;
    }
}