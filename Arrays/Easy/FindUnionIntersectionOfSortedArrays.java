
// brute force , time complexity O(nlogn) , space complexity O(n)

class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int a : arr1) {

            set.add(a);
        }

        for (int a : arr2) {

            set.add(a);
        }

        for (int a : set) {

            set.add(a);
        }

        int[] temp = new int[set.size()];

        int i = 0;

        for (int a : set) {

            temp[i] = a;
            i++;
        }

        Arrays.sort(temp);

        for (int a : temp) {
            ans.add(a);
        }

        return ans;
    }
}

class Solution {
    // Function to return a list containing the intersection of the two arrays.
    // time complexity O(N) , space complexity O(n)
    public static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) {
        // add your code here

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int a : arr1) {

            set.add(a);
        }

        for (int a : arr2) {

            if (set.contains(a)) {
                ans.add(a);
                set.remove(a);
            }
        }

        return ans;
    }
}