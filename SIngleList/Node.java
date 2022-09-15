package single_list;

public class Node {

    Student info;
    Node next;
    
    Node(){}
    
    Node(Student x, Node q)
    {
        info = x;
        next = q;
    }
    
    Node(Student x)
    {
        this(x, null);
    }
}


