class MyCalendarThree {
    Map<Integer, Integer> counts;
    public MyCalendarThree() {
        counts = new TreeMap<Integer, Integer>();
        
    }
    
    public int book(int startTime, int endTime) {
        
       counts.put(startTime, counts.getOrDefault(startTime, 0) +1);
        counts.put(endTime, counts.getOrDefault(endTime, 0) -1);
        int bookings =0;
        int max = 0;

        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            bookings = bookings + entry.getValue();
            max = Math.max(max, bookings);
        }
        return max;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */