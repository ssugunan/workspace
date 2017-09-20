import java.util.Scanner;

public class recursion {
	
	public static int getFactorial(int x){
		
		if(x==1||x==0)
		return 1;
		
		return x*getFactorial(x-1);
		
	}
	
	public static void isPrime(int x)
	{
		int count =x/2;
		boolean flag=false;
		for(int i=2;i<=count;i++)
		{
			if(x%i==0){
				flag=true;
				break;
		}}
			if(flag)
			{
				System.out.println("is not a prime number");
			}
			else
				System.out.println("is a prime number");
		
	}
	
	public static int fib(int x)
	{
		if(x==0)
			return 0;
		if(x==1)
			return 1;
		else
		return fib(x-1)+fib(x-2);
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(getFactorial(x));
		isPrime(x);
		System.out.println(fib(x));
		
		

	}

}
