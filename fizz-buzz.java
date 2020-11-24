class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> answer = new ArrayList<String>();
        
        // nothing to compare, just bail
        if (n == 0)
        {
            return answer;
        }
        
        for (int i = 1; i <= n; i++ )
        {
            if ((i % 3 == 0) && (i % 5 == 0))
                answer.add("FizzBuzz");
            else if (i % 3 == 0)
                answer.add("Fizz");
            else if(i % 5 == 0)
                answer.add("Buzz");
            else
                answer.add(String.valueOf(i));
        }        
        
        return answer;
        
    }
}
