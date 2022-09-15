
public class MyQueue {
    
    Node head, tail;
    
    public MyQueue() {
        head = tail = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public char front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return head.info;
    }

    //addLast
    public void enqueue(char x){
        if(isEmpty()){
            head = tail = new Node(x);
        }
         else {
            tail.next = new Node(x);
            tail = tail.next;
        }
    }
    
    public char dequeue() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        char x = head.info;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return (x);
    }

    void displayAll() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info + " ");
            p = p.next;
        }
        System.out.println();
    }
    
}
