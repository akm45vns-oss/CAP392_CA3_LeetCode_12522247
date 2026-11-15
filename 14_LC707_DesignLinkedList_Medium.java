class MyLinkedList {
    ArrayList<Integer>a=new ArrayList<>();
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        return a.get(index);
    }
    
    public void addAtHead(int val) {
        a.add(0,val);
    }
    
    public void addAtTail(int val) {
        a.add(val);
    }
    
    public void addAtIndex(int index, int val) {
        a.add(index,val);
    }
    
    public void deleteAtIndex(int index) {
        a.remove(index);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
