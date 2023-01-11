class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
    // going from bottom to top
        while(tx>=sx && ty>=sy){ //if small then cant be reached
            if(tx==sx && ty==sy) return true;
            if(tx>ty){ // if tx is greater instead of going to each step we can skip some steps ; if x>y then (x+y),y else opposite
                tx%=ty;
            }
            else{
                ty%=tx;
            }
            if(tx==sx){ //if one of them is equal now we seperate it and then we just subtract now ty-sy and take mod with tx if 0 then true else false;
                return (ty-sy)%tx==0;
            }
            if(ty==sy){
                return (tx-sx)%ty==0;
            }
        }
        return false;


    }
}
