class MyQueue {

    int[] arr;
    int front;
    int rear;
    int size;

    MyQueue(int n) {
        arr = new int[n];
        front = 0;
        rear = -1;
        size = -1;
    }

    void enqueue(int data) {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }
        arr[rear] = data;
        rear = (rear + 1) % arr.length;
        size++;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return data;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }

    void printQueue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < front + size; i++) {
            System.out.print(arr[i % arr.length] + " ");
        }
        System.out.println();
    }

}