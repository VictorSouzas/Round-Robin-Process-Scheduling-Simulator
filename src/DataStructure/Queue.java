package DataStructure;

public class Queue<T> {
    private Node first;
    private Node last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Queue(T value) {
        this();
        add(value);
    }

    public T getFirst() {
        return (T) first.getValue();
    }

    public void add(T value){
        Node newNode = new Node(value);
        if(isEmpty()){
            this.first = this.last = newNode;
            size++;
            return;
        }
        if(search(value))
            return;
        if(this.first == this.last){
            this.last = newNode;
            this.first.setNext(this.last);
            size++;
            return;
        }
        this.last.setNext(newNode);
        this.last = newNode;
        size++;
    }

    public boolean search(T value){
        Node aux = this.first;
        for (int i = 0; i <= getSize(); i++){
            if (aux.getValue() == value)
                return true;
            aux = aux.getNext();
        }
        return false;
    }

    public T remove(){
        Node newNode = this.first;
        this.first = this.first.getNext();
        return (T) newNode.getValue();
    }

    public boolean isEmpty(){
        return size <= 0;
    }

    public int getSize() {
        return size;
    }

}
