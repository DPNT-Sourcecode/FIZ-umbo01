package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
//    - The old rules for "deluxe" do not apply.
//  - A number is "fizz deluxe" if it is divisible by 3 AND it has a 3 in it
//  - A number is "buzz deluxe" if it is divisible by 5 AND it has a 5 in it
//  - We should still say "fake deluxe" if the "deluxe" number is odd
//  - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
//  - All the previous rules for "fizz" and "buzz" are still valid
    public String fizzBuzz(Integer number) {
        boolean fizz=false, buzz = false, deluxe=false, fakeDeluxe=false;

        if(number%3 == 0 && has3(number))
        {
            fizz=true;
            deluxe=true;
        }
        if(number%5 == 0 && has5(number))
        {
            buzz=true;
            deluxe=true;
        }
        if(deluxe && number%2 != 0)
            fakeDeluxe=true;
            
        if(fizz && buzz && fakeDeluxe)
            return "fizz buzz fake deluxe";
        if(fizz && buzz && deluxe)
            return "fizz buzz deluxe";
        if(fizz && buzz)
            return "fizz buzz";
        if(fizz && fakeDeluxe)
            return "fizz fake deluxe";
        if(fizz && deluxe)
            return "fizz deluxe";
        if(fizz)
            return "fizz";
        if(buzz && fakeDeluxe)
            return "buzz fake deluxe";
        if(buzz && deluxe)
            return "buzz deluxe";
        if(buzz)
            return "buzz";
        if(deluxe)
            return "deluxe";
        if(fakeDeluxe)
            return "fake deluxe";
        return number.toString();     
    }
    public boolean hasAllDigitsIdentical(int number)
    {
        int digit=number%10;
        number=number/10;
        while(number>0)
        {
            if(number%10 != digit)
                return false;
            digit=number%10;
            number=number/10;
        }
        return true;
    }
    public boolean has3(int number)
    {
        while(number>0)
        {
            if(number%10 == 3)
                return true;
            number=number/10;
        }
        return false;
    }
 
    public boolean has5(int number)
    {
        while(number>0)
        {
            if(number%10 == 5)
                return true;
            number=number/10;
        }
        return false;
    }
    
}
