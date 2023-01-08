public static int maxProfit(int k, List<Integer> profit) {
        int ans=Integer.MIN_VALUE,i=0,j=0,sum=0;
        while(j<=profit.size()/2){
            sum+=profit.get(j)+profit.get((j+profit.size()/2)%profit.size());
            if(j-i+1==k){
                ans=Math.max(ans,sum);
                sum-=profit.get(i)+profit.get((i+profit.size()/2)%profit.size());
                ++i;
            }
            ++j;
        }
        return ans;
    }
