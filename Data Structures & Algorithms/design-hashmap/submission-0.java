class ListNode{
    int key;
    int value;
    ListNode next;

        public  ListNode(int key, int value, ListNode next){
            this.key= key;
            this.value= value;
            this.next=next;
        }
}

class MyHashMap {
    ListNode[] nodes = new ListNode[1024];
    public MyHashMap() {
        for (int i=0; i<nodes.length; i++){
            nodes[i]=new ListNode(-1,-1,null);
        }
    }
    public int hashkey(int key){
        return key % nodes.length;
    }
    public void put(int key, int value) {
        ListNode cnode= nodes[hashkey(key)];
        while(cnode.next!=null){
            if(cnode.next.key==key){
                cnode.next.value=value;
                return;
            }
            cnode=cnode.next;
        }
        cnode.next=new ListNode(key,value,null);
    }
    
    public int get(int key) {
        ListNode cnode= nodes[hashkey(key)];
        while(cnode.next!=null){
            if(cnode.next.key==key){
                return cnode.next.value;
            }
            cnode= cnode.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        ListNode cnode= nodes[hashkey(key)];
        while(cnode.next!=null){
            if(cnode.next.key==key){
                cnode.next=cnode.next.next;
                return;
            }
            cnode= cnode.next;
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