package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        boolean fizz=false, buzz = false;
        if(number%3 == 0 || has3(number))
            fizz=true;
        if(number%5 == 0 || has5(number))
            buzz=true;
        if(fizz && buzz)
            return "fizz buzz";
        if(fizz)
            return "fizz";
        if(buzz)
            return "buzz";
        return number.toString();     
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
