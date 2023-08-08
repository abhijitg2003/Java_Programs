import java.util.*;

public class Nibble_swap
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);


	    
	    // If integer is given 
	    /*
	    int givenNumber = scan.nextInt();
	    String givenByte = Integer.toBinaryString(givenNumber);
	    
	    
	    if(givenByte.length() < 8)
	    {
	        int l = 8 - givenByte.length();
	        
	        while(l>0)
	        {
	            givenByte = "0" + givenByte;
	            l--;
	        }
	    }
	    */




	    
	    String givenByte = scan.next();
	    
	    if(givenByte.length() != 8)
	    {
	        System.out.println("Invalid input.");
	    }
	    else {
	        
	        String s1 = givenByte.substring(0,4);
	        String s2 = givenByte.substring(4,8);
	        
	        String swapped = s2 + s1;
	        System.out.println(Integer.parseInt(swapped,2));
	    }
		

        
	}
}
