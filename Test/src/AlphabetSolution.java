import java.util.Scanner;

	public class AlphabetSolution {
	    public int titleToNumber(String s) {
	        
	        int result=0;
	        
	         for(int i=s.length()-1,n=0;i>=0;i--,n++){
	        	 int value =s.charAt(i)-'A'+1;
	          result =result+value*((int)(Math.pow(26, n)));
	         }  
	        
	       return result;
	        
	    }
	    public static void main(String args[])
	    {
	    	Scanner sc= new Scanner(System.in);
	    	String s =sc.next();
	    	AlphabetSolution as=new AlphabetSolution();
		    int result =as.titleToNumber(s);
		    System.out.println(result);
		    
	    }
	    
	}


