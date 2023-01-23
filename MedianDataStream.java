class MedianFinder {
    List<Integer> list;
    public MedianFinder() {
        list= new ArrayList<>();
    }
    
    public void addNum(int num) {
       if(list.size()==0 || list.get(list.size()-1)< num){
           list.add(num);
       }
       else{
           int position=bs(list,num);
           list.add(position,num);
       }
    }
    private int bs(List<Integer> list, int num){
        int low=0;
        int high=list.size()-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(list.get(mid)<=num){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    
    public double findMedian() {
        int size=list.size();
        if(size%2==0){
            int mid=size/2;
            return (double)(list.get(mid)+list.get(mid-1))/2.0;
        }
        else{
            int mid=size/2;
            return (double)list.get(mid);
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
