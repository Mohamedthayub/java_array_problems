import java.util.Arrays;
public class rotate_arr{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int temp ; 
        temp = arr[arr.length - 1];
        for(int i = (arr.length -1); i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
/*
Given an array, the task is to cyclically rotate the array clockwise by one time. 

Examples:  


Input: arr[] = {1, 2, 3, 4, 5} 
Output: arr[] = {5, 1, 2, 3, 4}


Input: arr[] = {2, 3, 4, 5, 1}
Output: {1, 2, 3, 4, 5}

*/