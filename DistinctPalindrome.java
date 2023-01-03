public static void palindromeSubStrs(String s){
        Set<String> hSet= new LinkedHashSet<>();
        int i=0;
        int j=0;
        int k= s.length();
        while(i<k && j<k){
            String front= s.substring(i,j+1);
            String rev = new StringBuilder(front).reverse().toString();
            if(front.equals(rev)){
                hSet.add(front);
            }
            j++;
            if(j==k) {
                i++;
                j=i;
            }
        }
        for(String aa: hSet){
        System.out.println(aa);
        }
    }
