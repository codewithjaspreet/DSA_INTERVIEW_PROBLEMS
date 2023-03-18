class Node:
    def __init__(self, data):

        self.data = data
        self.next = None


class LinkedList():

    def __init__(self):
        self.head = None

    def printList(self):

        if self.head == None:
            print("List is empty")

        temp = self.head
        while (temp):

            print(temp.data , end=" ")
            temp = temp.next

    def add_begin(self, new_data ):


            new_node = Node(new_data)
            new_node.next = self.head
            self.head = new_node


    def add_last(self , new_data):
         

         newNode = Node(new_data)

         if self.head is None:
            self.head = newNode
        

         n = self.head
    
         while n.next is not None:
              n = n.next

         n.next = newNode
        

    def add_between(self  ,data,  x):

        n = self.head
        while n is not None:

            if n.data == x:
                break
            n = n.next


        if n is None:
            print("Node is not present in the list")

        else:
            newNode  = Node(data)
            newNode.next = n.next
            n.next = newNode        

        




        



ll1 = LinkedList()
ll1.add_begin(1)
ll1.add_begin(2)
ll1.add_last(3)
ll1.add_between(5,1)
ll1.printList()
