class Solution {
    public int maxSubArray(int[] nums) {
        
        // initalize output to first item in list
        // could be any valid integer based on input
        // requirements
        int output = nums[0];
        int currentSum = 0;
        
        // we dont need to do anything if the input
        // is just one element. return that value.
        if(nums.length == 1)
            return output;
        
        // loop through input array
        for(int i = 0; i < nums.length; i++) {
            
            // if we encounter a case where the sum is less than zero
            // we know that this isn't the largest sum and we will
            // exclude the last pass from our sliding window
            if(currentSum < 0)
                currentSum = 0;
            
            // add the value of the current element to the running sum
            currentSum += nums[i];
            
            // return the higher of either the current sum or the current
            // computed output
            output = Math.max(currentSum, output);
        }
            
        return output;
    }
}