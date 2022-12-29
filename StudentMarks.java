public static int studentMarks(String[][] student){
        int n= student.length;
        Map<String,List<Integer>> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(student[i][0])){
                List<Integer> value= hm.get(student[i][0]);
                value.add(Integer.valueOf(student[i][1]));
                hm.put(student[i][0],value);
            }
            else{
                List<Integer> value = new ArrayList<>();
                value.add(Integer.valueOf(student[i][1]));
                hm.put(student[i][0],value);
            }
        }
        int max= Integer.MIN_VALUE;
        for(Map.Entry<String, List<Integer>> entry: hm.entrySet()){
            int num= entry.getValue().size();
            int sum=0;

            for(int val: entry.getValue()){
                sum+=val;
            }
            int avg= (int) Math.floor(sum/num);
            if(avg>max){
                max=avg;
            }
        }
        return max;
    }
