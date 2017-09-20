
public class DemoThreadRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Current Thread is "+ Thread.currentThread().getId());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoThreadRunnable dtr= new DemoThreadRunnable();
		for(int i=0;i<10;i++)
		{
			Thread t= new Thread(dtr) ;
			t.start();
		}

	}

}
