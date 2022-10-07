package alvtree;

public class AVLTree {

    Node root;

    public AVLTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    Node rotateLeft(Node p) {// tam quay la con phai
        if (p == null || p.right == null) {
            System.out.println("Cannot perform left rotation");
            return p;
        }
        Node pr = p.right;
        p.right = pr.left;
        pr.left = p;
        return pr;
    }

    Node rotateRight(Node p) {// tam quay la con trai
        if (p == null || p.left == null) {
            System.out.println("Cannot perform right rotation");
            return p;
        }
        Node pl = p.left;
        p.left = pl.right;
        pl.right = p;
        return (pl);
    }

    Node leftBalance(Node p) {
        if (p.bal != -2) {
            System.out.println("No need to balance");

        }
        Node p1, p2;
        p1 = p.left;
        switch (p1.bal) {
            case -1: // p lech trai, p1 cung lech trai, ta co LL -> quay phai cay p
                p1.bal = 0;
                p.bal = 0;
                return (rotateRight(p));
            case +1: // p lech trai, p1 lech phai, ta co LR -> quay L, roi uay R
                p2 = p1.right;
                switch (p2.bal) {
                    case 0: // p2 can bang
                        p.bal = 0;
                        p1.bal = 0;
                        break;
                    case -1: // p2 kech trai
                        p.bal = 1;
                        p1.bal = 0;
                        break;
                    case +1:
                        p.bal = 0;
                        p1.bal = -1;
                        break;
                }// end switch(p2.bal)
                p2.bal = 0;
                p.left = rotateLeft(p1);
                return (rotateRight(p));
        }// end switch p1.bal
        return (p);
    }

    Node rightBalance(Node p) {
        if (p.bal != +2) {
            System.out.println("No need to balance");

        }
        Node p1, p2;
        p1 = p.right;
        switch (p1.bal) {
            case +1: // p lech phai, p1 cung lech phai, ta co RR -> quay trai cay p
                p1.bal = 0;
                p.bal = 0;
                return (rotateLeft(p));
            case -1: // p lech phai, p1 lech trai, ta co RL -> quay R, roi uay L
                p2 = p1.left;
                switch (p2.bal) {
                    case 0: // p2 can bang
                        p.bal = 0;
                        p1.bal = 0;
                        break;
                    case -1: // p2 lech trai
                        p.bal = 0;
                        p1.bal = +1;
                        break;
                    case +1:// p2 lech phai
                        p.bal = -1;
                        p1.bal = 0;
                        break;
                }// end switch(p2.bal)
                p2.bal = 0;
                p.right = rotateRight(p1);
                return (rotateLeft(p));
        }// end switch p1.bal
        return (p);
    }

    void insert(int x) {
        if (root == null) {
            root = new Node(x);
            return;
        }
        Node p, s, fp, fs, q, pp;
        p = s = root;
        fp = fs = null;
        while (p != null) {
            if (p.infor == x) {
                System.out.println("A node with value " + x + " is already exist");
                return;
            } else if (p.infor < x) {
                fp = p;
                p = p.right;
            } else {
                fp = p;
                p = p.left;
            }
            // if a node is unbalance, s will hold it
            if (p != null && p.bal != 0) {
                fs = fp;
                s = p;
            }
        }
        q = new Node(x);
        if (fp.infor > x) {
            fp.left = q;
        } else {
            fp.right = q;
        }
        p = s;
        // update balance index
        while (p != q) {
            if (p.infor < x) {
                p.bal++;
                p = p.right;
            } else {
                p.bal--;
                p = p.left;
            }
        }
        if (Math.abs(s.bal) != 2) {
            return;
        }
        // balance the subtree
        if (s.bal == 2) {
            pp = rightBalance(s);
        } else {
            pp = leftBalance(s);
        }
        // append new balanced subtree to the fs
        if (fs == null) {
            root = pp;
            return;
        }
        if (s == fs.left) {
            fs.left = pp;
            return;
        } else {
            fs.right = pp;
            return;
        }
    }

    void visit(Node p) {
        if (p == null) {
            return;
        }
        System.out.print(" " + p.infor + "(" + p.bal + ")");
    }

    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    void addArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }

    void breadthTraverse() {
        MyQueue q = new MyQueue();
        q.enqueue(root);
        Node p;
        while (!q.isEmpty()) {
            p = (Node) q.dequeue();
            visit(p);
            if (p.left != null) {
                q.enqueue((Object) p.left);
            }
            if (p.right != null) {
                q.enqueue((Object) p.right);
            }
        } // end while

    }

}
