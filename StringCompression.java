public static int compress(char[] chars) {
        int count=0;
        int idx=0;
        char currKey= chars[0];
        for(int i=0;i<chars.length;i++){
            if(chars[i]==currKey){
                count++;
            }
            else{
                chars[idx]=currKey;
                if(count!=1){
                    String res= String.valueOf(count);
                    for(int j=0;j<res.length();j++){
                        idx++;
                        chars[idx]= res.charAt(j);
                    }
                }
                count=0;
                currKey=chars[i];
                i--;
                idx++;
            }
        }
        chars[idx]=currKey;
        if(count!=1){
            String res= String.valueOf(count);
            for(int j=0;j<res.length();j++){
                idx++;
                chars[idx]= res.charAt(j);
            }
        }
        return idx+1;
    }
