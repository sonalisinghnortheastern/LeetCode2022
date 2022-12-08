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
                if(result.compareTo(maxValue)>0){
                    maxValue=result;
                }
                j++;
            }
        }
        return maxValue;
    }
