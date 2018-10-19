package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
//  - A number is considered to be "deluxe" if it is greater than 10 and all the digits are identical
    public String fizzBuzz(Integer number) {
        boolean fizz=false, buzz = false, deluxe=false;
        if(number>10 && hasAllDigitsIdentical(number))
            deluxe=true;
        if(number%3 == 0 || has3(number))
            fizz=true;
        if(number%5 == 0 || has5(number))
            buzz=true;
        if(fizz && buzz && deluxe)
            return "fizz buzz deluxe";
        if(fizz && buzz)
            return "fizz buzz";
        if(fizz)
            return "fizz";
        if(buzz)
            return "buzz";
        if(deluxe)
            return "deluxe";
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
