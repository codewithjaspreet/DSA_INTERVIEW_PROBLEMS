
import java.util.Arrays;
import java.util.NoSuchElementException;

public class MaxHeap { 
  private int size;
  private int[] heap  = new int[100];

  public MaxHeap() {
    
    heap[0] = -1;
    this.size = 0;

  }

 

  private void swap(int index1, int index2) {
    int element = heap[index1];
    heap[index1] = heap[index2];
    heap[index2] = element;
  }

  // Time Complexity : O( Log n)
  public void add(int item) {
    size++;
    int index = size;
    heap[index] = item;

    while(index > 1){

        int parent = index /2;

        if(heap[parent] < heap[index]){

            swap(parent, index);
        }

        else{

            return;
        }
    }


   
  }


  // delete the root node

  // step 1 - swap the root node with last node
  // step 2 - Remove the last node
  // step 3 - Propagate the root node at its correct position
  // step 4  -  O(logN)

  void delete(){

    if(size == 0) {

        System.out.print("Nothing to be deleted");
        return;
    }

    heap[1] = heap[size];
    size --;

    int i = 1;

    while(i < size){

        int leftIndex = 2*i;
        int rightIndex = 2 * i + 1;

        if(leftIndex < size && heap[i] < heap[leftIndex]){

            swap(i, leftIndex);
            i = leftIndex;
        }

        else if(rightIndex < size && heap[i] < heap[rightIndex]){

            swap(i, rightIndex);
            i = rightIndex;

        }

        else{

            return;
        }



    }

   }

  private void printHeap() {
    for (int i = 1; i <= size; i++) {
      System.out.print(heap[i] + " ");
    }
    System.out.println();

  }

  public static void main(String[] args) {
    MaxHeap maxHeap = new MaxHeap();


    maxHeap.add(50);
    maxHeap.add(55);
    maxHeap.add(53);
    maxHeap.add(52);
    maxHeap.add(54);
    maxHeap.printHeap();
    maxHeap.delete();
    maxHeap.printHeap();
  }
}