 public static ArrayList<Integer> Question1(String A, final List<String> B){
        ArrayList<Integer> res = new ArrayList<>();
        Map<String,Integer> hm = new HashMap<>();
        for(String val : B){
            if(!hm.containsKey(val)){
                hm.put(val,1);
            }
            else{
                int value = hm.get(val);
                hm.put(val,value+1);
            }
        }
        int searchSize = B.get(0).length()*B.size();
        for(int i=0;i<=A.length()-searchSize;i++){
            HashMap<String, Integer> tempMap =
                    (HashMap<String, Integer>) ((HashMap<String, Integer>) hm).clone();
            String bigWord= A.substring(i,i+searchSize);
            int j=0;
            while(j<searchSize){
                String b = bigWord.substring(j,j+(B.get(0).length()));
                if(tempMap.containsKey(b)){
                    int value= tempMap.get(b);
                    if(value==1){
                        tempMap.remove(b);
                    }
                    else{
                        tempMap.put(b,value-1);
                    }
                    j+=(B.get(0).length());
                }
                else{
                    break;
                }
            }
            if(tempMap.isEmpty()){
                res.add(i);
            }
        }

        return res;
    }
