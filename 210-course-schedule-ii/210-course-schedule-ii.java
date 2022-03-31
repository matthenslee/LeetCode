class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> preReqMap = new HashMap<>();
        
        for(int i=0; i<numCourses; i++){
            preReqMap.put(i, new ArrayList<>());
        }
        
        for(int[] pre : prerequisites){
            preReqMap.get(pre[0]).add(pre[1]);
        }
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> visit = new HashSet<>();
        Set<Integer> cycle = new HashSet<>();
        for(int i=0; i<numCourses; i++){
            if(!dfs(i, visit, cycle, preReqMap, result)) {
                return new int[0];
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public boolean dfs(int crs, Set<Integer> visit, Set<Integer> cycle, Map<Integer, List<Integer>> preReqMap, List<Integer> result) {
        if(cycle.contains(crs)) return false;
        if(visit.contains(crs)) return true;
        cycle.add(crs);
        for(Integer pre : preReqMap.get(crs)) {
            if(!dfs(pre, visit, cycle, preReqMap, result)) return false;
        }
        cycle.remove(crs);
        visit.add(crs);
        result.add(crs);
        return true;
    }
        
    
}