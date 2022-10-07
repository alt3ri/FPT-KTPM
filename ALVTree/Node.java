package alvtree;

public class Node {
    int infor;
    int bal;
    Node left;
    Node right;

    public Node(int x) {
        infor = x;
        left = right = null;
        bal = 0;
    }
    
    
}
