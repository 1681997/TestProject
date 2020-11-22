
public class FizzBuzzTest1 {
	
	    public static void main(String args[])
	    {
	    
	        for(int i = 1; i <= 100; i++) 
	        {
	            if(i % 3 == 0)    //for multiples of 3 print “Fizz”
	        		System.out.println("Fizz");
	        	else if(i % 5 == 0)   //for multiples of 5 print “Buzz”
		            	System.out.println("Buzz");
	            if(i % (3*5) == 0)    //for multiples of 3 and 5 print “FizzBuzz”
	            	System.out.println("FizzBuzz");
	            else System.out.println(i);
	        } 
	    } 

	}


