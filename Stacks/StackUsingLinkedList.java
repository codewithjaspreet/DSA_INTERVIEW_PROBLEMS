class MyStack {

    Node head;
    int size;

    public MyStack() {

        head = null;
        size = 0;
    }

    void push(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    int peek() {

        if (head == null) {

            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

    int pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    boolean isEmpty() {
        return head == null;
    }

    int getSize() {
        return size;
    }

}