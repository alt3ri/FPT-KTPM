package single_list;

import single_list.Node;
import single_list.Student;

public class MyList {
   Node head, tail;
   
   MyList()
   {
       head = tail = null;
   }
   
   boolean isEmpty()
   {
       return (head == null);
   }
   
   void clear(){ 
       head = tail = null; 
   }
   
   void addLast(Student x)
   {
       Node q = new Node(x);
       {
           if(isEmpty()){
               head = tail = q;
               return ;
           }
           tail.next = q;
           tail = q;
       }
   }
   
   void visit(Node p)
   {
       if( p != null)
       {
           System.out.println(p.info);
       }
   }
   
   void traverse()
   {
       Node p = head;
       while(p!= null)
       {
           visit(p);
           p=p.next;
       }
       System.out.println();
   }
   
   void addMany(String[] a,  int[] b)
   {
       int n, i;
       n = a.length;
       for(i = 0; i < n; i++)
       {
           addLast(new Student(a[i], b[i]));
       }
   }
   Node searchByName(String xName)
   {
       Node p = head;
       while(p!=null)
       {
           if(p.info.name.equals(xName))
           {
               return(p);
           }
           p=p.next;
       }
       return null;
   }
   
   Node searchByAge(int xAge)
   {
       Node p = head;
       while(p!=null)
       {
           if(p.info.age == xAge)
           {
               return(p);
           }
           p=p.next;
       }
       return null;
   }
   
   void addFirst(Student x)
   {
       head = new Node(x, head);
   }
   
   void insertAfter(Node q, Student x)
   {
       if(isEmpty() || q == null)
       {
           return;
       }
       Node q1 = q.next;
       Node p = new Node(x, q1);
       q.next = p;
       if(tail == q)
       {
           tail = p;
       }
   }
   
   void insertBefore(Node q, Student x)
   {
       if(isEmpty() || q == null)
       {
           return;
       }
       
       if(q == head)
       {
           addFirst(x);
           return;
       }
       
       Node f = head;
       while(f!=null && f.next != q)
       {
           f = f.next;
       }
       if(f == null) return;
       insertAfter(f, x);
   }
   
   void removeFirst()
   {
       if(isEmpty())
       {
           tail = null;
           return;
       }
       head=head.next;
   }
   
   
    void remove(Node q)
   {
       if(isEmpty() || q == null)
       {
           return;
       }
       if(q == head)
       {
           removeFirst();
           return;
       }
       Node f = head;
       while( f!= null & f.next != q)
       {
           f=f.next;
       }
       
       if(f==null) return;
       
       f.next = q.next;
       if(f.next == null)
       {
           tail = f;
       }
   }
    
    void remove(String xName)
    {
        Node q = searchByName(xName);
        remove(q);
    }
    
    void remove(int xAge)
    {
       Node q = searchByAge(xAge);
       remove(q);
    }
    
    void removeAll(int xAge)
    {
        Node q;
        while(true)
        {
            q = searchByAge(xAge);
            if(q == null) break;
            remove(q);
        }
    }
    
    Node pos(int k)
    {
        int i = 0;
        Node p = head;
        while(p != null)
        {
            if(i == k) return(p);
            i++;
            p=p.next;
        }
        return null;
    }
    
    void removePos(int k)
    {
        Node q = pos(k);
        remove(q);
    }
    
    void sortByName()
    {
        Node pi, pj;
        Student x;
        pi = head;
        while(pi != null)
        {
            pj = pi.next;
            while(pj != null)
            {
                if(pj.info.name.compareTo(pi.info.name) < 0)
                {
                    x = pi.info;
                    pi.info = pj.info;
                    pj.info = x;
                }
                pj = pj.next;
            }
            pi = pi.next;
        }
    }
    
    void sortByAge()
    {
        Node pi, pj;
        Student x;
        pi = head;
        while(pi!=null)
        {
            pj=pi.next;
            while(pj!=null)
            {
                if(pj.info.age < pi.info.age)
                {
                    x = pi.info;
                    pi.info = pj.info;
                    pj.info = x;
                }
                pj=pj.next;
            }
            pi=pi.next;
        }
    }
    
    int size()
    {
        int i = 0;
        Node p = head;
        while(p!=null)
        {
            i++;
            p=p.next;
        }
        return i;
    }

    Student[] toArray()
    {
        int i, n;
        n = size();
        Student[] a = new Student[n];
        Node p = head;
        i = 0;
        while(p!=null)
        {
            a[i++] = new Student(p.info.name, p.info.age);
            p=p.next;
        }
        return a;
    }
    
    void reverse()
    {
        MyList t = new MyList();
        Node p = head;
        while(p!= null)
        {
            t.addFirst(new Student(p.info.name, p.info.age));
            p=p.next;
        }
        head = t.head;
        tail = t.tail;
    }
    
    Node findMaxAge()
    {
        if(isEmpty()) return (null);
        Node q, p;
        p = q = head;
        int maxAge = head.info.age;
        p = p.next;
        while(p!=null)
        {
            if(p.info.age > maxAge)
            {
                maxAge = p.info.age;
                q = p;
            }
            p = p.next; 
        }
        return q;
    }
    
     Node findMinAge()
    {
        if(isEmpty()) return (null);
        Node q, p;
        p = q = head;
        int minAge = head.info.age;
        p = p.next;
        while(p!=null)
        {
            if(p.info.age < minAge)
            {
                minAge = p.info.age;
                q = p;
            }
            p = p.next; 
        }
        return q;
    }

    void setData(Node p, Student x)
    {
        if(p != null)
        {
            p.info = x;
        }
    }
    
    void sortByAge(int k, int h)
    {
        if(k > h) return;
        if(k < 0) k = 0;
        int n = size();
        if(h > n-1)
        {
            h = n - 1;
        }
        Node u = pos(k);
        Node v = pos(h);
        Node pi, pj;
        Student x;
        pi = u;
        while(pi != v)
        {
            pj = pi.next;
            while(pj != v)
            {
               if(pj.info.age < pi.info.age)
                {
                    x = pi.info;
                    pi.info = pj.info;
                    pj.info = x;
                }
                pj=pj.next; 
            }
            pi = pi.next;
        }
    }
    
    void reverse(int k, int h)
    {
        if(k > h) return;
        if(k < 0) k = 0;
        int n = size();
        if(h > n-1 || k < 0)
        {
            return;
        }
        Student[] a = toArray();
        int i = k;
        int j = h;
        Student x;
        while(i < j)
        {
            x=a[i];
            a[i] = a[j];
            a[j] = x;
            i++;
            j--;
        }
        clear();
        for(i = 0; i < n; i++)
        {
            addLast(a[i]);
        }
    }
}
