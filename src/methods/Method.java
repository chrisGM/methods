package methods;
import java.util.*;
public class Method {

	public static void welcome()
	{
		System.out.println("This program adds numbers from 1 to a value the user chooses.");
		System.out.print("Please enter a positive integer greater than or equal to 1: ");
		//Prompts user what the program does to enter a value
	}//welcome
	
	public static int getVal()
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);//Scanner initialized
			int getVal = scan.nextInt();//User input saved as variable 'getVal'
		
		//The following code runs after the 'isValid' method, it calls the return value from the 'isValid' method 	
		boolean validation = isValid(getVal);
		//Variable 'validation' is declared as a boolean using the value returned from the 'isValid' method
		//System.out.println("First validation value: "+validation);//testingPoint
		while (!validation)
		//This while loop repeats as long as the boolean 'validation' is not true
		{
			System.out.print("The input "+getVal+" is incorrect please enter a value greater than or equal to 1: ");
			//Error statement in case the 'getVal' value is less than 1, prompts user for new value  
				getVal = scan.nextInt();//New value replaces previous value within variable 'getVal'
			validation = isValid(getVal);
			//The 'validation' value is updated after the new 'getVal' is stored and reran in the method 'isValid' 
			//System.out.println("New getVal after error: "+getVal);//testingPoint
			//System.out.println("Validation after error: "+validation);//testingPoint
		}//while (!validation)
		return getVal;//The value of 'getVal' is returned
	}//getVal
	
    public static boolean isValid(int getVal)
	{
    	//This method uses the value returned from the 'getVal' method
    	//After this code runs the value is used in the 'getVal' method if the value returned is false
    	int minValue = 1;//minimum value that a user can input is initialized
    	if (getVal >= minValue)//if statement compares the minimum value to the user input value
		{
		return true;
		//if the user input is greater than the minimum value this method returns a boolean value true
		}//if
		else
		{
		return false;
		//if the user input is less than the minimum value this method returns a boolean value false
		}//else
		
	}//isValid
    
    public static int loop(int getVal)
    {
    	//This method uses the return value from method 'getVal' 
    	int startingValue = 1;//this is the starting value numbers will be added from this to the value user inputs, also the minimum value a user can input
		int sumInteger = 0;//starting sum of all integers added initialized
		int userMaxVal = getVal;//the return value from method 'getVal' is saved as variable 'userMaxVal'
		while (startingValue <= userMaxVal)//as long as the startingValue is less than the value the user input this loop runs
		{
			sumInteger = sumInteger + startingValue;//starting from one this function adds all the integers up until the user input integer 
			startingValue++;//increments starting value after each summation 
		}//while (startingValue <= userMaxVal)
		//System.out.println("Sum for true: "+sumInteger);//Testing Point 
		return sumInteger;//The final value of sumInteger is returned
		
		//This code was not efficient new code is more streamlined and efficient
		/*if (isValid == true)
		{	
			while (startingValue <= userMaxVal)//as long as the startingValue is less than the value the user input this loop runs
			{
				sumInteger = sumInteger + startingValue;//starting from one this function adds all the integers up until the user input integer 
				startingValue++;//increments starting value after each summation 
			}//while (startingValue <= userMaxVal)
			System.out.println("Sum for true: "+sumInteger);//Testing Point 
			return sumInteger;
		}//if
		
		else 
		{
			while (getVal < startingValue)//compares user input to the min value allowed
			{
				System.out.print("The value "+getVal+" is incorrect please enter a value greater than or equal to 1: ");//error message if value is incorrect user must enter new value
					getVal = scan.nextInt();
				System.out.println("User input: "+getVal);//Testing Point
			}//while (userMaxVal < startingValue || userMaxVal > maximumValue)
			while (startingValue <= getVal)//as long as the startingValue is less than the value the user input this loop runs
			{
				sumInteger = sumInteger + startingValue;//starting from one this function adds all the integers up until the user input integer 
				startingValue++;//increments starting value after each summation 
			}//while (startingValue <= userMaxVal)
			System.out.println("Sum for else: "+sumInteger);//Testing Point 
			return sumInteger;
		}//else
		*/
			
    }//loop
    
    public static void goodbye(int sumInteger)
    {
    	//This method uses the value returned from the method 'sumInteger' 
    	System.out.println("Your final sum is: "+sumInteger);
    	System.out.println("Thank you goodbye.");
    	//Prompts user of their final sum and says goodbye
    }//goodbye

	    
}//Method
