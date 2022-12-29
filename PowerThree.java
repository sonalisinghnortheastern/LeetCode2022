class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        if(n<0) return false;
        // while(n>1){
        //     int remainder=n%3;
        //     n= n/3;
        //     if(remainder>0) return false;
        // }
        // return true;
        return (Math.log10(n)/Math.log10(3))%1==0;
    }
}
