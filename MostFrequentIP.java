public class Main {
    public static void main(String[] args) {
        System.out.println("Most Frequent IP!");
        
        getMostFrequentIp(new String[]{"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24","10.0.0.1 - GET 2020-08-24","10.0.0.2 - GET 2020-08-20", "10.0.0.3 - GET 2020-08-24","10.0.0.3 - GET 2020-08-24","10.0.0.3 - GET 2020-08-24","10.0.0.4 - GET 2020-08-24"});
    }
    
    public static void getMostFrequentIp(String[] logs){
        Map<String,Integer> hm = new HashMap<>();
        for(String log:logs){
            String ipAdress= log.split(" ")[0];
            if(hm.containsKey(ipAdress)){
                int value= hm.get(ipAdress);
                hm.put(ipAdress,value+1);
            }
            else{
                 hm.put(ipAdress,1);
            }
        }
        int freq=0;
        for(String ip:hm.keySet()){
            freq=Math.max(freq,hm.get(ip));
        }
        List<String>frequentlyUsedIp=new ArrayList<>();
        for(String ip:hm.keySet()){
            if(hm.get(ip)==freq){
                frequentlyUsedIp.add(ip);
            }
        }
        Collections.sort(frequentlyUsedIp);
        System.out.println(frequentlyUsedIp) ;
    }
    
}
