

def heapify(arr, n, i):
	parent = int(((i-1)/2))
	if arr[parent] > 0:
		if arr[i] > arr[parent]:
			arr[i], arr[parent] = arr[parent], arr[i]
			heapify(arr, n, parent)


def insertNode(arr, key):
	global n
	n += 1
	arr.append(key)
	heapify(arr, n, n-1)


def printArr(arr, n):
	for i in range(n):
		print(arr[i], end=" ")


# Array representation of Max-Heap
'''
        10
       /  \
      5    3
     / \
    2   4
'''
arr = [10, 5, 3, 2, 4, 1, 7]
n = 7
key = 70
insertNode(arr, key)
printArr(arr, n)

