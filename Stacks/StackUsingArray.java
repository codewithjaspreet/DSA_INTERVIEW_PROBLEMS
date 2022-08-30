package Stacks.Arrays;

public class Stack {

    int a[];
    int top;

    int capacity;

    public Stack(int capacity) {

        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }

    void push(int data) {

        if (top == capacity - 1) {

            System.out.println("Overflow");

        }
        top++;
        a[top] = data;
    }

    int pop() {
        if (top == -1) {

            System.out.println("Underflow");

        }
        int res = a[top];
        top--;
        return res;
    }

    int peek() {

        if (top == -1) {

            System.out.println("Overflow");
        }

        return a[top];
    }

    boolean isEmpty() {

        return top == -1;

    }

    public static void display(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(1);
        stack.push(5);
        stack.push(22);
        stack.pop();
        stack.push(36);
        stack.push(32);
        display(stack.a);
    }
}