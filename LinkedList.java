import java.util.Scanner;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void deleteWithValue(int data) {
        if (head == null)
            return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    void PrintNode(){
        Node cur = head;
        while(cur.next != null){
            System.out.println(cur.data);
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int key, data;
        do {
            System.out.println(
                    "Enter a key:\n 1:Append data to linked list \t  2:Prepend data to linked list \t  3: Delete by value \t 4:Print \t 5:exit");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Enter a number to append");
                    data = sc.nextInt();
                    l1.append(data);
                    break;
                case 2:
                    System.out.println("Enter a number to append");
                    data = sc.nextInt();
                    l1.prepend(data);
                    break;
                case 3:
                    System.out.println("Enter a number to append");
                    data = sc.nextInt();
                    l1.deleteWithValue(data);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("stupid");
                    break;
            }
        } while (key != 5);
            sc.close();
    }
}