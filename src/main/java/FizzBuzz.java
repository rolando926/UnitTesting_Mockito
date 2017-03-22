/**
 * Created by RXC8414 on 3/20/2017.
 */
public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String[] str = new String[end-start];
        int counter = 0;
        for(int i = start; i < end;i++){
            if(i%3 == 0){
                if(i%5 == 0){
                    str[counter] = "FizzBuzz";
                    counter++;
                    continue;
                }
                str[counter] = "Fizz";
            }
            else if(i%5 == 0){
                str[counter] = "Buzz";
            }
            else{
                str[counter] = Integer.toString(i);
            }
            counter++;
        }
        return str;
    }
}
