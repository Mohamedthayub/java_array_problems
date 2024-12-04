public class product_sum{
    public static void main(String[] args){
        int num = 145;
        int lastdigit = 0 ;
        int sum = 0;
        int productsum = 1;
        while(num > 0){
            lastdigit = num % 10;
            productsum = productsum * lastdigit;
            sum = sum + lastdigit;
            num =(num / 10);
            
        }
        System.out.println(productsum - sum);
    }
}