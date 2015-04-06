package methods;

public class MainHw {

	public static void main(String[] args) {
	
		Method.welcome();//Calls the welcome method
		int userValue = Method.getVal();
		//Saves the value from Method.getVal() under variable 'userValue' in the main
		//System.out.println("Main testing point: "+userValue);//testingPoint
		//boolean isValid = Method.isValid(userValue);//<-code not needed part of the inefficient code 
		int sumInteger = Method.loop(userValue);
		//Calls the Method.Loop method and the parameters used is the value from 'userValue' in the main
		//The return value from Method.loop is saved as variable 'sumInteger' in main
		Method.goodbye(sumInteger);
		//Goodbye message class is called uses the parameter value from variable 'sumInteger'
		
	}//main

}//class
