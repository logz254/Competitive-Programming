import java.util.*;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> diviz= new ArrayList<String>();
        for(int number=1;number<=n; number++)
        {
            boolean divisible3 = (number%3==0);
            boolean divisible5 =(number%5==0);
            
            if(divisible3 && divisible5)
            {
                diviz.add("FizzBuzz");
            }
            else if(divisible3)
            {
                diviz.add("Fizz");
            }
            else if(divisible5)
            {
                diviz.add("Buzz");
            }
            else
            {
                diviz.add(Integer.toString(number));
            }
        }
        return diviz;
      
}   
}
