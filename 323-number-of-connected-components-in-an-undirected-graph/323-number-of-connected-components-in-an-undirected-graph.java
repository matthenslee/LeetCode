// input n nodes, with array of edges
// output number of connected edges in undirected graph

// init output counter to zero
// create graph structure
// recreate the graph strucutre
//          iterate over the inputs
//              create object, insert into structure
// perform dfs on graph, return count common edges of graph

class Solution {
    public int countComponents(int n, int[][] edges) {
        
        int counter = 0;
        int[] visited = new int[n];
        List<Integer>[] adjList = new ArrayList[n];
        
        // init array list
        for(int i = 0; i < n; i++){
            adjList[i] = new ArrayList<Integer>();
        }
        
        // add edges to adjacencylist
        for(int i = 0; i < edges.length; i++){
            adjList[edges[i][0]].add(edges[i][1]);
            adjList[edges[i][1]].add(edges[i][0]);
        }
        
        for(int i = 0; i < n; i++){
            if(visited[i] == 0){
                counter++;
                dfs(adjList,visited,i);
            }
        }
        
        return counter;
        
        
    }
    
     private void dfs(List<Integer>[] adjList, int[] visited, int startNode) {
        visited[startNode] = 1;
         
        for (int i = 0; i < adjList[startNode].size(); i++) {
            if (visited[adjList[startNode].get(i)] == 0) {
                dfs(adjList, visited, adjList[startNode].get(i));
            }
        }
    }
}