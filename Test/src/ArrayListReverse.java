import java.util.Scanner;
import java.io.IOException;

public class ArrayListReverse {
	
	public static void main(String args[]) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		Integer.parseInt("0");		System.out.println("Please enter the number of elements");
		int i =sc.nextInt();
		
		System.out.println("Please enter individual elements");
		int arr[] = new int[i];
		int k=0;
		
		
		while(sc.hasNextInt())
		{
			arr[k]=sc.nextInt();
			k++;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(arr[j]);
			if(j!=0)
			{
				System.out.print(" ");
			}
		}
		
	}

}
