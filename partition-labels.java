class Solution {
    public List<Integer> partitionLabels(String S) {
        
        int length = S.length();
        List<Integer> answer = new ArrayList<Integer>();
        int[] occurances = new int[26];
        int stringBoundary = 0;
        int counter = 0;
        
        // String might be empty, if so, exit.
        if(length == 0)
        {
            return answer;
        }
        
        // Get the number of occurances of English alphabet characters
        // and store them inside an array sorted from A-Z
        for (int i = 0; i < S.length(); ++i)
        {
            occurances[S.charAt(i) - 'a'] = i;
        }
        
        // Iterate through input string, then compare our array from earlier
        // with the current character inside the string, advancing the pointer per round.
        for(int i = 0; i < length; ++i)
        {
            char currentPosition = S.charAt(i);            
            stringBoundary = Math.max(stringBoundary, occurances[currentPosition - 'a']);            
            counter++;
            
            // if we've hit the partition then add that as an answer
            // then reset the counter for the next iteration
            if(i == stringBoundary)
            {
                answer.add(counter);
                counter = 0;
            }
        }        
        
        return answer;
        
    }
}
