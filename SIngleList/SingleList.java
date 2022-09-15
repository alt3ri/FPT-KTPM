package single_list;

import single_list.MyList;

public class SingleList {
    public static void main(String[] args)
    {
        MyList t = new MyList();
        Node p, q;
        Student x;
        int k;
        String[] a  = {"A", "C", "B", "E", "D"};
        int[] b = {9, 5 , 17, 5, 8};
        System.out.println("\n1. Test addLast and add Many");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        
        System.out.println("\n2. Test searchByName");
        t.clear();
        t.addMany(a,b);
        t.traverse();
        p=t.searchByName("B");
        if(p==null) System.out.println("Not Found");
        else{
            System.out.println("The student found is");
            t.visit(p);
            System.out.println();
        }
        
        System.out.println("\n3. Test addFirst");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        x = new Student("x", 30);
        q = t.searchByName("B");
        t.insertAfter(q, x);
        t.traverse();
        
        System.out.println("\n5. Test insertBefore");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        x = new Student("x", 30);
        q = t.searchByName("B");
        t.insertBefore(q, x);
        t.traverse();
        
        System.out.println("\n6. Test remove(Node q), q = (B,17)");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        q = t.searchByName("B");
        t.remove(q);
        t.traverse();
        
        System.out.println("\n7. Test remove(String xName), xName = B");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        t.remove("B");
        t.traverse();
        
        System.out.println("\n8. Test remove(int xAge), xAge = 5");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        t.removeAll(5);
        t.traverse();
        
        System.out.println("\n10. Test pos(int k), k = 2");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        p = t.pos(2);
        System.out.println("The Student at position 2 is ");
        t.visit(p);
        System.out.println();
        
        System.out.println("\n10. Test removePos(int k), k = 2");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        t.removePos(2);
        t.traverse();
        
        System.out.println("\n12. Test sortByName()");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        t.sortByName();
        t.traverse();
        
        System.out.println("\n13. Test sortByAge()");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        t.sortByAge();
        t.traverse();
        
        System.out.println("\n14. Test size()");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        k = t.size();
        System.out.println("Size = " + k);
        
        System.out.println("\n15. Test toArray()");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        Student[] u = t.toArray();
        if(u!= null)
        {
            System.out.println("The arrray u is: ");
            for(int i = 0; i < a.length; i++)
            {
                System.out.println(u[i]);
            }
            System.out.println();
        }
        
        System.out.println("\n16. Test reverse()");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        t.reverse();
        t.traverse();
        
        System.out.println("\n17. Test findMaxAge()");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        p = t.findMaxAge();
        System.out.println("The student with maximun age: ");
        t.visit(p);
        System.out.println();
        
        System.out.println("\n18. findMinAge()");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        p = t.findMinAge();
        System.out.println("The student with minimun age: ");
        t.visit(p);
        System.out.println();
        
        System.out.println("\n19. Test setData()");
        t.clear();
        t.addMany(a, b);
        t.traverse();
        p = t.searchByName("B");
        x = new Student("XX", 99);
        t.setData(p,x);
        
        String[] c = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        int[] d = {9, 8, 7 ,6 ,5 ,4 ,3 , 2, 1};
        
        System.out.println("\n20.Test sortByAge(3,6)");
        t.clear();
        t.addMany(c, d);
        t.traverse();
        t.sortByAge(3,6);
        t.traverse();
        
        System.out.println("\n21.Test reverse(3,6)");
        t.clear();
        t.addMany(c, d);
        t.traverse();
        t.reverse(3,6);
        t.traverse();
    }
}
