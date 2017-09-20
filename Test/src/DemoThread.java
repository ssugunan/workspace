
public class DemoThread extends Thread {
	
	public void run(){
		System.out.println("Thread running is :"+ this.currentThread().getId());
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<10;i++)
		{
			DemoThread dt= new DemoThread();
			dt.start();
		}

	}

}
