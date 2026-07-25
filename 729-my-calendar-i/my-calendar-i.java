class MyCalendar {
    Map<Integer, Integer> counts;
    public  MyCalendar() {
        counts = new TreeMap<Integer, Integer>();
    }
   
    public boolean book(int start, int end) {
        counts.put(start, counts.getOrDefault(start, 0) +1);
        counts.put(end, counts.getOrDefault(end, 0) -1);
        int bookings =0;

        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            bookings = bookings + entry.getValue();

            if(bookings > 1){
             counts.put(start, counts.getOrDefault(start, 0) -1);
             counts.put(end, counts.getOrDefault(end, 0) +1);

             return false;
            }
        }
        return true;
        

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */