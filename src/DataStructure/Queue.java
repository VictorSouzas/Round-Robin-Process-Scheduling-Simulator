package DataStructure;

public class Queue<T> {
    private Node start;
    private Node end;
    private int size;

    public Queue() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public void add(T value){
        Node newNode = new Node(value);
        if(isEmpty()){
            this.start = this.end = newNode;
            size++;
            return;
        }
        if(this.start == this.end){
            this.end = newNode;
            this.start.setNext(this.end);
            size++;
            return;
        }
        this.end.setNext(newNode);
        this.end = newNode;
        size++;
    }

    public T remove(){

    }

    public boolean isEmpty(){
        return size <= 0;
    }

    public int getSize() {
        return size;
    }

}
