class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> answer = new HashMap<>();
        
        for(String s: strs){
            char[] carry = s.toCharArray();
            
            Arrays.sort(carry);
            
            String key = new String(carry);
            if(!answer.containsKey(key)){
                answer.put(key, new ArrayList<String>());                
            }
            answer.get(key).add(s);
        }
        
        return new ArrayList<>(answer.values());
        
    }
}