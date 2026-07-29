class MyHashSet {
    int[] set;

    public MyHashSet() {
         set= new int[40000];
    }
    
    public void add(int key) {
        set[key/32] |= getvalue(key);
    }
    
    public void remove(int key) {
        if(contains(key)){
            set[key/32] ^= getvalue(key);
        }
    }
    
    public boolean contains(int key) {
        if ((set[key/32] & getvalue(key)) !=0){
        return true;
        }
        return false;
    }
    public int getvalue(int x){
        return 1<< ( x % 32 ) ;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */