
package Dijkstra;

import java.util.*;

/**
 *
 * @author bbbvv
 */
public class MyStack {

    LinkedList<Integer> t;

    public MyStack() {
        t = new LinkedList<Integer>();
    }

    void clear() {
        t.clear();
    }

    boolean isEmpty() {
        return t.isEmpty();
    }

    public void push(Integer x) {
        t.addFirst(x);
    }

    Integer pop() {
        if (isEmpty()) {
            return null;
        }
        return t.removeFirst();
    }
    
    Integer top(){
        if(isEmpty()){
            return null;
        }
        return t.getFirst();
    }
}//end class my stack
