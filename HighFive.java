public static List<List<Integer>> highFive(List<List<Integer>> records){
    Map<Integer,List<Integer>> hm = new HashMap<>();
        for(List<Integer> val:records){
            int id= val.get(0);
            int marks= val.get(1);
            List<Integer> allMarks;
            if(hm.containsKey(id)){
                allMarks = hm.get(id);
            }
            else{
                allMarks = new ArrayList<>();
            }
            allMarks.add(marks);
            hm.put(id,allMarks);
        }
        TreeMap<Integer,List<Integer>> treeMap = new TreeMap<>(hm);
        List<List<Integer>> finalValues= new ArrayList<>();
        for (Map.Entry<Integer,List<Integer>> entry:treeMap.entrySet()){
            Collections.sort(entry.getValue());
            Collections.reverse(entry.getValue());
            int sum=0;
            for(int i=0;i<5 && i<entry.getValue().size();i++){
                sum+=entry.getValue().get(i);
            }
            int average= sum/5;
            List<Integer> tempVal= new ArrayList<>();
            tempVal.add(entry.getKey());
            tempVal.add(average);
            finalValues.add(tempVal);
        }
        return finalValues;

    }
