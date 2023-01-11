class Solution {
     Set<Integer> visitedCities= new HashSet<>();
    public int findCircleNum(int[][] isConnected){
        int numOfProvience=0;
        for(int i=0;i<isConnected.length;i++){  // first we are iterating through each row and add to visited city.Then we know that there is a path 
                                                    from here so we increment number of provience and then do dfs in that path.
                                                    We take particular row go in dfs and then check each value in row.if it is 1 and is not in visited then again do dfs.
            if(visitedCities.add(i)){
                numOfProvience++;
                dfs(isConnected,i);
            }
        }
        return numOfProvience;
    }
    private void dfs(int[][] isConnected,int particularCity){
        for(int i=0;i<isConnected[0].length;i++){
            if(isConnected[particularCity][i]==1 && visitedCities.add(i))
            {
                dfs(isConnected,i);
            }
        }
    }
}
