import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by RXC8414 on 3/20/2017.
 */
public class FizzBuzzTests extends FizzBuzz {


    @DataProvider(name = "myData")
    public Object[][] myData() {
        return new Object[][]{{1, 6, "1", "2", "Fizz", "4", "Buzz"},
                {1, 8, "1", "2", "Fizz", "4", "Buzz", "Fizz", "7"},
                {1, 11, "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"},
                {1, 16, "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"},
                {1,4,"1", "2", "Fizz"},
                {1,2,"1"},
                {50,56,"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"},
                {15,17,"FizzBuzz", "16"},
                {30,36,"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"},
                {1000,1006,"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"}};
    }

    @Test(dataProvider = "myData")
    public void verifyValue1(int value1, int value2, String... arryVal){
        Assert.assertEquals(fizzBuzz(value1,value2),arryVal);
    }

}
