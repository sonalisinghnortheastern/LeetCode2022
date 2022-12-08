public static String lexographicString(String str){
        int i=0;
        int j=0;
        String maxValue="";
        String result="";
        while(i<str.length()){
            if(j==str.length()){
                i++;
                j=i;
                result="";
            }
            else{
                result+= str.charAt(j);
                if(result.compareTo(maxValue)>0){  // returns +ve if result>maxValue , 0 if equal , -ve if result<maxValue
                    maxValue=result;
                }
                j++;
            }
        }
        return maxValue;
    }
