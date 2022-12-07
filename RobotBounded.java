class Solution {
    public boolean isRobotBounded(String instructions) {
        int[] axis = new int[]{0,0};
        String currentDirection="N";
        char[]instruction=instructions.toCharArray();
        for(Character instruct:instruction){
            if(currentDirection=="N" && instruct=='L'){
                currentDirection="W";
            }
            else if(currentDirection=="N" && instruct=='R'){
                currentDirection="E";
            }
            else if(currentDirection=="S" && instruct=='L'){
                currentDirection="E";
            }
            else if(currentDirection=="S" && instruct=='R'){
                currentDirection="W";
            }
            else if(currentDirection=="E" && instruct=='L'){
                currentDirection="N";
            }
            else if(currentDirection=="E" && instruct=='R'){
                currentDirection="S";
            }
            else if(currentDirection=="W" && instruct=='L'){
                currentDirection="S";
            }
            else if(currentDirection=="W" && instruct=='R'){
                currentDirection="N";
            }
            else{
                if(currentDirection=="N"){
                    axis[1]=axis[1]+1;
                }
                else if(currentDirection=="S"){
                    axis[1]=axis[1]-1;
                }
                else if(currentDirection=="E"){
                    axis[0]=axis[0]-1;
                }
                else if(currentDirection=="W"){
                    axis[0]=axis[0]+1;
                }
            }
        }
        if((axis[0]==0 && axis[1]==0) || currentDirection != "N" )
        {
            return true;
        }
        return false;
        
    }
}
