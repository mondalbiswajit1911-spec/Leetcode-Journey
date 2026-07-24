class MyCalendarTwo {
    Map<Integer, Integer> counts;
    public MyCalendarTwo() {
        counts = new TreeMap<Integer, Integer>();
    }
    
    public boolean book(int startTime, int endTime) {
        int cnt = 0;
        counts.put(startTime, counts.getOrDefault(startTime, 0) +1);
        counts.put(endTime, counts.getOrDefault(endTime, 0) -1);

        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            cnt = cnt + entry.getValue();
            if(cnt > 2){
                counts.put(startTime, counts.getOrDefault(startTime, 0) -1);
                counts.put(endTime, counts.getOrDefault(endTime, 0) +1);
                if(counts.get(startTime)==0){
                    counts.remove(startTime);
                }
                  if(counts.get(endTime)==0){
                    counts.remove(endTime);
                }
                return false;
            }
        }
        return true;
        

    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */