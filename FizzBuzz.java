public class FizzBuzz{
    public String fizzBuzz(int number){
        String result;
        result = "null";
        if(number%3 == 0 && number%5 == 0){
            result = "FizzBuzz";
        } else if(number%5 == 0 && number %3 !=0){
            result = "Buzz";
        } else if(number%3 == 0 && number %5 !=0) {
            result = "Fizz";
        } else{
            result = Integer.toString(number);
        }
        return result;
    }
}