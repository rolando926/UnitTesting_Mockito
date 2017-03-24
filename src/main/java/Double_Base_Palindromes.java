/**
 * Created by RXC8414 on 3/24/2017.
 */
public class Double_Base_Palindromes {
    private int range;

    Double_Base_Palindromes(int range){
        this.range = range;
    }

    public void findPallindrome(){
        int sum = 0;

        for(int i = 10; i < range; i++){
            boolean blnPallindrome = true;
            String number = String.valueOf(i);
            int length = number.length() - 1;
            for(int y = 0; y < (number.length()/2); y++){
                if(number.charAt(y) != number.charAt(length)){
                    blnPallindrome = false;
                    break;
                }
                length--;
            }
            if(blnPallindrome) {
                if(isBinaryPallindrome(i)) {
                    sum += i;
                }
            }
        }

        System.out.println("The sum of all decimal Pallindromes is: "+sum);
    }

    public boolean isBinaryPallindrome(int num){
        String binary = Integer.toBinaryString(num);
        int length = binary.length() - 1;
        for(int i = 0; i < (length / 2); i++){
            if(binary.charAt(i) != binary.charAt(length)){
                return false;
            }
            length--;
        }
        return true;
    }

}
