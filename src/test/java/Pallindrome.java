import org.testng.annotations.Test;

/**
 * Created by RXC8414 on 3/24/2017.
 */
public class Pallindrome {
    @Test
    public void  verifyAllPallindromes(){
        Double_Base_Palindromes pallin = new Double_Base_Palindromes(1000000);
        pallin.findPallindrome();
    }
}
