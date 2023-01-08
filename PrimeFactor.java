public static void primeFactor(int num){
        int i=2;
        while(num>=1){
            if(num%i==0){
                System.out.println(i);
                num=num/i;
            }
            else{
                i++;
            }
        }
    }
    
    public static void primeFactor(int num){
        while(num%2==0){
            System.out.println("2");
            num=num/2;
        }
        int i=3;
        while(i<=Math.sqrt(num)){
            if(num%i==0){
                System.out.println(i);
                num=num/i;
            }
            else{
                i+=2;
            }
        }
        if(num>2) System.out.println(num);
    }
