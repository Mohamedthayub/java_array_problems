public class linear_search{
    static int linearsearch(int arr[], int x){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
     }
    public static void main(String[] args){
        int[] arr = {4,3,5,2,1};
        int x = 3;
        System.out.print(linearsearch(arr,x));
    }
}