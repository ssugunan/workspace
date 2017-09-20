
public class BinarySearch {

	public int getBinarySearch(int[] arr, int sIndex,int eIndex, int var)
	{
		if(eIndex>=sIndex)
		{
			int midIndex =sIndex+(eIndex-sIndex/2);
			if(arr[midIndex]==var)
				return midIndex;
			else if(arr[midIndex]>var)
			{
				return getBinarySearch(arr, 0, midIndex-1, var);
			}else
				return getBinarySearch(arr, midIndex+1,eIndex , var);
		}
		else return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs= new BinarySearch();
		int arr[] ={4, 5, 6, 7, 9, 10,12, 23, 40};
		int length =arr.length-1;
		int var =23;
		System.out.println(bs.getBinarySearch(arr, 0, length, var));
	}
}