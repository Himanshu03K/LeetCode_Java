class MyCalendarThree {

    TreeMap<Integer, Integer> time;
    public MyCalendarThree() {
        time= new TreeMap<>();
    }
    
    public int book(int start, int end) {
        time.put(start,time.getOrDefault(start,0)+1);
        time.put(end, time.getOrDefault(end,0)-1);
        
        int max=0, count=0;
        for(int i: time.values()){
            max=Math.max(max, count+= i);
        }
        return max;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */