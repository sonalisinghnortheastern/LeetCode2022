public int heightChecker(int[] heights) {
        int[] comparingHeights=new int[heights.length];
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            comparingHeights[i]= heights[i];
        }
        Arrays.sort(comparingHeights);
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=comparingHeights[i])
            {
                count++;
            }
        }
        return count;
        
    }


class Solution {
    public int heightChecker(int[] heights) {
    int[] expected= new int[101];
    for(int height: heights){
        expected[height]++;
    }
    int res=0;
    int count=0;
    for(int i=0;i<heights.length;i++){
        while(expected[count]==0) count++;
        if(count!=heights[i]) res++;
        expected[count]--;
    }
    return res;

    }
}
