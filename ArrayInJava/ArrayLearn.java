package ArrayInJava;

import java.util.Scanner;

public class ArrayLearn {

    // Method to access an element
    public static int accessElement(int nums[], int pos) {
        return nums[pos];
    }

    // Method to search for an element
    public static boolean searchForElement(int nums[], int element) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return true;
            }
        }
        return false;
    }

    // Method to traverse the array
    public static void traverseTheArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Method to insert an element into the array
    public static int[] insertingIntoArray(int nums[], int pos, int element) {
        int newArray[] = new int[nums.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == pos) {
                newArray[i] = element;
            } else {
                newArray[i] = nums[j++];
            }
        }
        return newArray;
    }

    // Method to delete an element from the array
    public static int[] deletingFromArray(int nums[], int pos) {
        int newArray[] = new int[nums.length - 1]; // New array size is one less
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (i != pos) {
                newArray[j++] = nums[i];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an array
        int arr[] = {1, 2, 3, 4, 5};

        // Accessing an element
        int accessedElement = accessElement(arr, 2);
        System.out.println("Accessed Element at position 2: " + accessedElement);

        // Searching for an element
        boolean isFound = searchForElement(arr, 3);
        System.out.println("Is element 3 found? " + isFound);

        // Traversing the array
        System.out.print("Array elements: ");
        traverseTheArray(arr);

        // Inserting an element
        int[] newArr = insertingIntoArray(arr, 2, 10);
        System.out.print("Array after inserting 10 at position 2: ");
        traverseTheArray(newArr);

        // Deleting an element
        int[] afterDeletion = deletingFromArray(newArr, 2);
        System.out.print("Array after deleting element at position 2: ");
        traverseTheArray(afterDeletion);
    }
}
