class TimeMap {

Map<String,TreeMap<Integer,String>> timeMap;

public TimeMap() {
    timeMap = new HashMap<>();
    
}

public void set(String key, String value, int timestamp) {
    
    if(!timeMap.containsKey(key)){
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(timestamp,value);
        timeMap.put(key,treeMap);
    }
    else {
        TreeMap<Integer,String> treeMap = timeMap.get(key);
        treeMap.put(timestamp,value);
    }
    
}

public String get(String key, int timestamp) {
    if(timeMap.containsKey(key)){
         Integer floorKey = timeMap.get(key).floorKey(timestamp);
        if(null == floorKey) return "";
        return timeMap.get(key).get(floorKey);
    }
       
    return "";
}
}