class StringToAtoi {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int sign=1;
        int i=0;
        long result=0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        while(i<s.length()){
            int digit=s.charAt(i)-'0';
            if(digit>=0 && digit<=9){
                result=result*10+digit;
                i++;
            }
            else{
                break;
            }
            if(result>Integer.MAX_VALUE){
                return (sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE);
            }
        }
        return (int)result*sign;
    }
}