package _02_RecursionMath;

public class RecursionMath {

    public static int recursiveMultiplication(int number, int times) {
        // If times is 1 
            // Return number 
if(times==1) {return number;}
        // Else return number + recursiveMultiplication(number, times-1)
else return number + recursiveMultiplication(number, times-1);
    }

    // Try this one on your own! 
    // Hint: if numberToDivideBy is bigger than number,
    //       you can't divide anymore
    public static int recursiveDivision(int number, int numberToDivideBy) {
    	//take number
    	//subtract divisor from it
    	//add 1 to result
    	//if divisor is bigger than number its 0
    	if(numberToDivideBy==1) {return number;}
    	if(numberToDivideBy>number) {return 0;}
    	return number - recursiveDivision(number-numberToDivideBy,numberToDivideBy);
    }

    // Try this one on your own!
    public static int recursivePower(int number, int power) {
        
        return 0;
    }
}
