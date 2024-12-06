public class running_sum{
    public static void main(String[] args){
        int sum = 0;
        int[] arr = {1,1,1,1,1};
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
            arr[i] = sum ;
        }
        for(int j = 0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}