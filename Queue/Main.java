import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        int choice;
        char x;
        Scanner s = new Scanner(System.in); 
        MyQueue q = new MyQueue();
        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display all");
            System.out.println("5. Quit");
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            if (choice == 5) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be enqueued: ");
                    x = s.next().charAt(0);
                    q.enqueue(x);
                    break;
                case 2:
                    x = q.dequeue();
                    System.out.println("Element dequeued: " + x);
                    break;
                case 3:
                    System.out.println("Element at front: " + q.front());
                    break;
                case 4:
                    q.displayAll();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println();
        }
    }
}
