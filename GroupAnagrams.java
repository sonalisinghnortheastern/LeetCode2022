class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();
        for(String word:strs){
            char[] occuranceArray = new char[26];
            for(char letter:word.toCharArray()){
                occuranceArray[letter-'a']++;
            }
            String eachWord= new String(occuranceArray);
            if(hm.containsKey(eachWord)){
                 hm.get(eachWord).add(word);
            }
            else{
                List<String> val= new ArrayList<>();
                val.add(word);
                hm.put(eachWord,val);
            }

    }
    return new ArrayList<>(hm.values());
}
}


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();
        for(String word:strs){
            char[] letters= word.toCharArray();
            Arrays.sort(letters);
            String newWord= new String(letters);
            List<String> allWord;
            if(hm.containsKey(newWord)){
                 allWord= hm.get(newWord);
            }
            else{
                 allWord= new ArrayList<>();
            }
             allWord.add(word);
             hm.put(newWord,allWord);
        }
        List<List<String>> allValues= new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:hm.entrySet()){
            allValues.add(entry.getValue());
        }
        return allValues;
    }
}
