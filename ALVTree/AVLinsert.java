
package alvtree;

import alvtree.AVLTree;

public class AVLinsert {
    public static void main(String[] args) {
        // TODO code application logic here
        AVLTree t = new AVLTree();
        int[] a = { 4, 3, 1, 11, 5, 8, 2, 6, 15, 12 };
        t.addArray(a);
        System.out.println("\nPre-Order traverse: ");
        t.preOrder(t.root);
        System.out.println("\nIn-Order traverse: ");
        t.inOrder(t.root);
        System.out.println("\nBreadth first traverse: ");
        t.breadthTraverse();
        System.out.println();
    }

}
