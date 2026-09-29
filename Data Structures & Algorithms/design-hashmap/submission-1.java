class MyNode{
    int key;
    int value;

    MyNode node;

    public MyNode(int key,int value,MyNode node){
        this.key= key;
        this.value= value;
        this.node = node;
    }
}


class MyHashMap {

    MyNode[] nodes ;

    public MyHashMap() {
       nodes = new MyNode[1024];
         for (int i=0; i<nodes.length; i++){
            nodes[i]=new MyNode(-1,-1,null);
        }
    }
    
    public void put(int key, int value) {
    MyNode current = nodes[getBucket(key)];
    while( current.node != null){
        current = current.node;
        if(current.key==key){
            current.value= value;
            return;
        }
    } 
    current.node = new MyNode(key,value,null);
    }
    
    public int get(int key) {
        MyNode current = nodes[getBucket(key)];
        while( current.node != null){
            current = current.node;
            if(key== current.key){
                return current.value;
            }
        } 
        return -1;
    }
    
    public void remove(int key) {
        MyNode current = nodes[getBucket(key)];
        while( current.node != null ){
            if(current.node.key== key){
                current.node= current.node.node;
            }
        } 
    }

    public int getBucket(int key){
        return key % nodes.length;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */