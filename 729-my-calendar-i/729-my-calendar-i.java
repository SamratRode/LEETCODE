class MyCalendar {
    List<List<Integer>> ll;

    public MyCalendar() {
        ll=new LinkedList<>();
        
    }
    
    public boolean book(int start, int end) {
        for(List<Integer> a:ll){
            if(a.get(0)<end && start<a.get(1)){
                return false;
            }
        }
            List<Integer> l=new LinkedList<>();
            l.add(start);
            l.add(end);
            ll.add(l);
            return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */