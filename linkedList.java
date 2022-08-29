import java.util.Scanner;

class node {
    int data;
    node next;

    node(int d) {
        data = d;
    }
}

class link {
    node head;

    void insert(int d) {
        node newnode = new node(d);
        newnode.next = head;
        head = newnode;
    }

    void insert(int key, int d) {
        node newnode = new node(d);
        node ptr = head;
        while (ptr != null) {
            if (ptr.data == key) {
                newnode.next = ptr.next;
                ptr.next = newnode;

                return;
            }
            ptr = ptr.next;
        }
    }

    void insertLast(int d) {
        node newnode = new node(d);
        if (head == null) {
            head = newnode;
            return;
        }
        node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
            ptr.next = newnode;
            return;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("_____Empty list_____");
            return;
        }
        node ptr = head;
        System.out.println("List data: ");
        while (ptr != null) {
            if (ptr.next != null) {
                System.out.print(ptr.data + "-->");
            } else {
                System.out.print(ptr.data);
            }
            ptr = ptr.next;
        }
    }

    void delete() {
        if (head != null) {
            head = head.next;
            System.out.println("Element Deleted");
        } else {
            System.out.println("_____Empty list_____");
        }
    }

    void delete(int nodedata) {
        if (head.data == nodedata) {
            head = head.next;
            return;
        }
        node ptr = head;
        while (ptr.next != null) {
            if (ptr.next.data == nodedata) {
                ptr.next = ptr.next.next;
                return;
            }
            ptr = ptr.next;
        }
    }

}

public class linkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt, data;
        link list = new link();

        do {
            System.out.print(
                    "\n\n1. Insert at beginning\n2. Insert after a key\n3. Insert last\n4. Delete at beginning\n5. Delete a specific element\n6. Display\n7. Exit\n");
            System.out.println("Enter option: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Enter node value to insert beginning: ");
                    data = sc.nextInt();
                    list.insert(data);
                    break;
                case 2:
                    System.out.println("Enter key and newnode value:");
                    int key = sc.nextInt();
                    data = sc.nextInt();
                    list.insert(key, data);
                    break;
                case 3:
                    System.out.println("Enter node value to insert last: ");
                    data = sc.nextInt();
                    list.insertLast(data);
                    break;
                case 4:
                    list.delete();
                    break;
                case 5:
                    System.out.println("Enter the element to delete: ");
                    data = sc.nextInt();
                    list.delete(data);
                    break;
                case 6:
                    list.display();
                    break;

                default:
                    break;
            }

        } while (opt != 7);
    }

}
