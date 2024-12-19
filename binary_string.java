public class binary_string{
    static boolean isBinary(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String res = "1001010101";
        System.out.println(isBinary(res));
    }
}