package myDataStruct;

public class myLink {
    public Node head = null;

    class Node {
        Node next = null;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * 尾插法
     * @param d
     */
    public void addNode (int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    public boolean deleteNode (int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }

        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    public int length () {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }

    public boolean deleteNode11 (Node n) {
        if (n == null || n.next == null)
            return false;
        int tmp = n.data;
        n.data = n.next.data;
        n.next.data = tmp;
        n.next = n.next.next;
        System.out.println("删除成功！");
        return true;
    }

    public static void printList (Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public static Node conveser(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head) {
        Node newHead = conveser(head);
        Node tmp = head;
        Node newtmp = newHead;
        while (tmp != null) {
            if (tmp.data != newtmp.data) {
                return false;
            }
            tmp = tmp.next;
            newtmp = newtmp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        myLink list = new myLink();
        list.addNode(1);
        list.addNode(1);
        list.addNode(2);
        list.addNode(1);
        printList(list.head);
        Node newh = conveser(list.head);
        printList(newh);
        System.out.println(isPalindrome(list.head));
    }
}
