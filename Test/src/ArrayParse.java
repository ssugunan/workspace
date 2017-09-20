
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class ArrayParse {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        long[] arr=new long[n];
	        int m = in.nextInt();
	        for(int a0 = 0; a0 < m; a0++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int k = in.nextInt();
	            int count=a-1;
	            while(count<b)
	            {
	               arr[count] =arr[count]+k;
	               count++;
	            }            
	        }
	        Arrays.sort(arr);
	        System.out.println(arr[arr.length-1]);
	        in.close();
	    }
	}



