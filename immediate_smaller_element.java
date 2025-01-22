import java.util.Arrays;
public class ImmediateSmallerElement {
    static int[] immediate_smaller(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // Prevent ArrayIndexOutOfBounds
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1]; // Replace with the immediate smaller element
            } else {
                arr[i] = -1; // No smaller element
            }
        }
        arr[arr.length - 1] = -1; // Last element always becomes -1
        return arr;
    }
    public static void main(String[] args) {
        int[] arr2 = {4, 2, 1, 5, 3};
        System.out.println(Arrays.toString(immediate_smaller(arr2)));
    }
}

/*

Given an integer array arr. For each element in the array, check whether the right adjacent element (on the next immediate position) of the array is smaller. If next element is smaller, update the current index to that element. If not, then update to -1. Return the modified array.

Examples:

Input: arr[] = [4, 2, 1, 5, 3]
Output: [2, 1, -1, 3, -1]
Explanation: Array elements are 4, 2, 1, 5, 3. Next to 4 is 2 which is smaller, so we print 2. Next of 2 is 1 which is smaller,so we print 1. Next of 1 is 5 which is greater, so we print -1. Next of 5 is 3 which is smaller, so we print 3.  Note that for last element, output is always  going to be -1 because there is no element on right.

*/

