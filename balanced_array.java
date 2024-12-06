public class balanced_array{
    public static void main(String[] args){
        int[] arr = {1,5,3,2};
        int sum  = 0;
        int sum2 = 0;
        int n = arr.length / 2;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        for(int j = n; j<arr.length; j++){
            sum2 = sum2 + arr[j];
        }
        if(sum > sum2){
            System.out.print( sum - sum2);
        }
        else{
            System.out.print(sum2 - sum);
        }
    }
}