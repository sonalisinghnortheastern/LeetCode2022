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
