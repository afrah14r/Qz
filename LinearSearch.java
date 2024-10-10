// Name: Afrah Ayoub 
// ID : 445013880
package khas;

class LinearSearch {

    // This Method returns index of element x in arr[]
    static int search(int arr[], int n, int x) {

        for (int i = 0; i < n; i++) {

            // Return the index of the element if the element
            // is found
            if (arr[i] == x) {
                return i;
            }

        }

        // return -1 if the element is not found
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 1, 7, 5};// Array of elements

        int n = arr.length;// Size of the array

        int x = 4;// Element to search for

        int index = search(arr, n, x);// Element to search for

        if (index == -1) {
            System.out.println("Element is not present in the array");
        } else {

            System.out.println("Element found at position " + (index + 1));
            //" Replaced "index" with position number (starting from 1, not 0)"
        }

    }

}
