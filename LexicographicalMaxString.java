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


public static String lexographicString(String str){
       String mx = "";
        for (int i = 0; i < str.length(); ++i) {
            if (mx.compareTo(str.substring(i)) <= 0) {
                mx = str.substring(i);
            }
        }
 
        return mx;
    }

static String LexicographicalMaxString(String str)
  {
    char maxchar = 'a';
    ArrayList<Integer> index = new ArrayList<Integer>();
 
    // We store all the indexes of maximum
    // characters we have in the string
    for (int i = 0; i < str.length(); i++)
    {
      if (str.charAt(i) >= maxchar)
      {
        maxchar = str.charAt(i);
        index.add(i);
      }
    }
    String maxstring = "";
 
    // We form a substring from that maximum
    // character index till end and check if
    // its greater that maxstring
    for (int i = 0; i < index.size(); i++)
    {
      if (str.substring(index.get(i),
                        str.length()).compareTo( maxstring) > 0)
      {
        maxstring = str.substring(index.get(i),
                                  str.length());
      }
    }
    return maxstring;
  }
