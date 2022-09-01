
// pop and top in o(1) time
// push take o(N) time

// using 2 queue
class MyStack {

    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    public MyStack() {

        mainQ = new ArrayDeque<>();

        helperQ = new ArrayDeque<>();

    }

    public void push(int x) {

        while (mainQ.size() > 0) {

            helperQ.add(mainQ.poll());
        }

        mainQ.add(x);

        while (helperQ.size() > 0) {

            mainQ.add(helperQ.poll());
        }

    }

    public int pop() {

        if (!empty()) {

            return mainQ.poll();
        }

        else {

            return -1;
        }

    }

    public int top() {

        if (!empty()) {

            return mainQ.peek();
        }

        else {

            return -1;
        }

    }

    public boolean empty() {

        return mainQ.isEmpty() ? true : false;
    }
}

// using single queue

class MyStack {

    Queue<Integer> mainQ;

    public MyStack() {

        mainQ = new ArrayDeque<>();

    }

    public void push(int x) {

        int size = mainQ.size();

        mainQ.add(x);

        for (int i = 0; i < size; i++) {

            int rem = mainQ.remove();
            mainQ.add(rem);
        }

    }

    public int pop() {

        if (!empty()) {

            return mainQ.poll();
        }

        else {

            return -1;
        }

    }

    public int top() {

        if (!empty()) {

            return mainQ.peek();
        }

        else {

            return -1;
        }

    }

    public boolean empty() {

        return mainQ.isEmpty() ? true : false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */