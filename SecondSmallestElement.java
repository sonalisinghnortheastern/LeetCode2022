public static int secondSmallest(int[] nums){
        int smallestElement= Integer.MAX_VALUE;
        int secondSmallestElement= Integer.MAX_VALUE;
        for(int num:nums){
            if(smallestElement>num){
                smallestElement=num;
            }
        }
        for(int num:nums){
            if(secondSmallestElement> num && num>smallestElement){
                secondSmallestElement=num;
            }
        }
        return secondSmallestElement;
    }


public static int secondSmallest(int[] nums){
        int smallestElement= Integer.MAX_VALUE;
        int secondSmallestElement= Integer.MAX_VALUE;
        for(int num:nums){
            if(num<smallestElement){
                secondSmallestElement=smallestElement;
                smallestElement=num;
            }
            else if(num<secondSmallestElement && num!=smallestElement){
                secondSmallestElement=num;
            }
        }
        return secondSmallestElement;
    }
