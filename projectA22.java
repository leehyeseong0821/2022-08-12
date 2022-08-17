package projectA15;
 
class as implements Runnable{
	
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Test"+i);
			i++;
		}
		
	}
}
class as1 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Send"+i);
			i++;
		}
		
	}
	
}
class as2 implements Runnable{
	
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("read"+i);
			i++;
		}
		
	}
}

public class projectA22 {

	public static void main(String[] args) {
	
		
		Thread th= new Thread(new as());
		Thread th1= new Thread(new as1());
		Thread th2= new Thread(new as2());
		
		th.start();
		th1.start();
		th2.start();
		
		

	}

}
