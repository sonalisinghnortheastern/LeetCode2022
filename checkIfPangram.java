class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i=97;i<123;i++){
            if(sentence.indexOf((char)i)==-1) return false;
        }
        return true;
    }
}

class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Integer,Integer> val= new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            Integer number=(int)sentence.charAt(i);
            if(!val.containsKey(number)){
                val.put(number,1);
            }
        }
        for(int i=97;i<123;i++){
            if(!val.containsKey(i)){
                return false;
            }
        }
        return true;
    }
}
