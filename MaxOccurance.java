public static Character maxOccurance(String word){
        Map<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<word.length();i++){
            if(!hm.containsKey(word.charAt(i))){
                hm.put(word.charAt(i),1);
            }else{
                int value= hm.get(word.charAt(i));
                hm.put(word.charAt(i),value+1);
            }
        }
        int max=Integer.MIN_VALUE;
        Character maxCharacter=' ';
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            int value= entry.getValue();
            Character key= entry.getKey();
            if(max<value){
                max=value;
                maxCharacter=key;
            }
        }
        return maxCharacter;
    }
