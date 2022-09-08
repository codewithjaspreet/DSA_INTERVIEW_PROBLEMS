package BinaryHeap;

public class BinaryHeep {
    int[] arr;
    int sizeofTree;
    // time O(1) and space O(N)

    // creation
    public BinaryHeep(int size) {
        arr = new int[size + 1];
        this.sizeofTree = 0;
        System.out.println("Binary heep is created");

    }

    // peek of binary heep
    public boolean isEmpty() {
        if (sizeofTree == 0) {
            return true;
        }
        return false;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Binary heep is empty");
            return -1;

        } else {
            return arr[1];
        }
    }

    public int sizeofBp() {
        return sizeofTree;
    }

    public void LevelOrder() {
        for (int i = 1; i <= sizeofTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Heapify for insert

    public void HeapifyBottomtoTop(int index, String heaptype) {

        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (heaptype.equals("Min")) {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;

            } else if (heaptype == "Max") {
                if (arr[index] > arr[parent]) {
                    int temp = arr[index];
                    arr[index] = arr[parent];
                    arr[parent] = temp;
                }
            }
            HeapifyBottomtoTop(parent, heaptype);
            // Space and time complexity is = O(LogN)

        }

    }

    // time and space complexity = o(LogN)
    public void insert(int value, String typeofHeap) {
        arr[sizeofTree + 1] = value;
        sizeofTree++;
        HeapifyBottomtoTop(sizeofTree, typeofHeap);
        System.out.println("Value is inserted");

    }
    // extract node from binary tree
    // time and space complexity = O(logN)

    // HeapTopToBottom method

    public void heapifytoptobottom(int index, String heaptype) {
        int left = index * 2;
        int right = index * 2 + 1;
        int swapchild = 0;

        if (sizeofTree < left) {
            return;
        }
        if (heaptype.equals("Max")) {
            if (sizeofTree == left) {
                if (arr[index] < arr[left]) {

                    swapchild(index, swapchild);

                }
            } else {
                if (arr[left] > arr[right]) {
                    swapchild = left;

                } else {
                    swapchild = right;
                }
                if (arr[index] < arr[swapchild]) {

                    swapchild(index, swapchild);
                }

            }
        } else if (heaptype.equals("Min")) {
            {
                if (sizeofTree == left) {
                    if (arr[index] > arr[left]) {
                        swapchild(index, left);
                    }
                    return;
                } else {
                    if (arr[left] < arr[right]) {
                        swapchild = left;

                    } else {
                        swapchild = right;
                    }
                    if (arr[index] > arr[swapchild]) {
                        swapchild(index, swapchild);
                    }

                }
            }
            heapifytoptobottom(swapchild, heaptype);

        }
    }

    void swapchild(int index, int swapchild) {
        int temp = arr[index];
        arr[index] = arr[swapchild];
        arr[swapchild] = temp;
    }

    // Time and space complexity = O(LogN)
    public int ExtractHeadOfBP(String heaptype) {
        if (isEmpty()) {
            return -1;
        } else {
            int extract = arr[1];
            arr[1] = arr[sizeofTree];
            sizeofTree--;
            heapifytoptobottom(1, heaptype);
            return extract;
        }
    }
    // Deletion of Binary Heap

    public void EntireDeletion() {
        arr = null;
        System.out.println("Binary Heap deleted Successfully");

    }

}
