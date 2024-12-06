public class reverse_arr{
    public static void main(String[] args){
        int[] temp ;
        int [] number = {1,2,3,4,5};
        for(int i = 1; i<=number.length; i++){
            temp[i- 1] = number[number.length - i];
        }
        for(int j = 0; j<temp.length; j++){
            arr[j] = temp[j];
        }
        
    }
}