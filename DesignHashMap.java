class MyHashMap {
    int[] hm ;
    boolean[] exists;
    public MyHashMap() {
       hm = new int[1000001];
       exists= new boolean[1000001];
    }
    
    public void put(int key, int value) {
       hm[key]=value;
       exists[key]=true;
    }
    
    public int get(int key) {
        if(exists[key]){
            return hm[key];
        }
        return -1;
    }
    
    public void remove(int key) {
        if(exists[key]){
            exists[key]=false;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
