public class sort_the_arr{
    public static void main(String[] args){
        int[] arr = {5,3,4,1,2};
        int temp;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num : arr){
            System.out.println(num + "");
        }
    }
}