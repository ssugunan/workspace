import java.util.Scanner;

public class Test {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int [][] arr =new int[][]{ {1,2,3},{4,5,6},{7,8,9}};
//        for(int a[]:arr){
//            for(int i:a){
//                System.out.println(i);
//            }
//        }
//		
//
//	}
	    public static int calcualteDiff(int [][] arr, int n)
	    {
	        int dia1=0;
	        int dia2 =0;
	        int i=0;
	        
	        while(i<n)
	        {
	            dia1+=arr[i][i];
	            dia2+=arr[i][n-1-i];
	            i++;
	        } 
	        
	        return Math.abs(dia1-dia2);
	        
	        
	        
	    }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner sc= new Scanner(System.in);
	        int n =sc.nextInt();
	        int [][] arr =new int[n][n];
	        for(int a[]:arr){
	        	for(int i=0;i<n;i++){
	                a[i]=5;
	            }
	        }
	        
	        System.out.println(calcualteDiff(arr,n));
	            
	    }
	
}
