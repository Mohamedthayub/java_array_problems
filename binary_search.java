public class binary_search{
    static int binarysearch(int arr[],int k){
        int first = 0;
        int last = arr.length - 1;
         
        while(first <= last){
            int mid = (first + last) / 2;
            if(arr[mid] == k){
                return arr[mid];
            }
            else if(arr[mid] < k){
                first = mid + 1;
            }
            else{
                last = last - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int k = 4;
        System.out.println(binarysearch(arr,k));
    }
}