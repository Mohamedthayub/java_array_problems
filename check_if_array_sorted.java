public class check_if_array_sorted{
     static boolean check_arr(int[] arr){
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    return false;
                }           

            }
            return true;
        }
    public static void main(String[] args){
       int[] arr = {5,3,3,4,2,1};
       System.out.println(check_arr(arr));
    }
}