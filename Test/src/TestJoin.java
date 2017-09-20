
public class TestJoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t =new Thread(()->{try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} System.out.println("print"+Thread.currentThread().getName());},"t1");
		
		Thread t1 =new Thread(()->{System.out.println("print"+Thread.currentThread().getName());},"t2");
		t.start();
		t1.start();
		t.join();
		t1.join();
	}

}
