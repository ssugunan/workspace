public class BubbleSort {  
    static void bubbleSort(int[] arr) {  
    	int l =arr.length;
    	int temp=0;
    	for(int i=0;i<l;i++){
    		for(int j=1;j<l-i;j++){
    			if(arr[j-1]>arr[j])
    			{
    				temp =arr[j];
    				arr[j]=arr[j-1];
    				arr[j-1] = temp;
    			}}
    			for(int a:arr)
    			{
    				System.out.print(a+" ");
    			}
    			System.out.println(" ");
    		
    	}   	
    	
    } 
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--; 
               for(int a:array)
            	  System.out.print(a+" "); 
               System.out.println();
            }  
            array[i+1] = key;  
        }  
    }  
    static void selectionSort(int arr[]){
    	
    	
		
	}
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
            //    bubbleSort(arr);//sorting array elements using bubble sort  
                 
//                System.out.println("Array After Bubble Sort");  
//                for(int i=0; i < arr.length; i++){  
//                        System.out.print(arr[i] + " ");  
//                }  
                
                insertionSort(arr);
   
        }  
}  