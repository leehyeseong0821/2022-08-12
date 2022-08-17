package projectA15;

 class th extends Thread{
	 
	@Override
	public void run() {
		for(int i=0;i<=1000;i++) {
			System.out.println("작업1");
		}
	} 
 }
	class th1 extends Thread{
		@Override
		public void run() {
			for(int i=0;i<=1000;i++) {
				System.out.println("작업2");
			}
		}
	}
	class th2 extends Thread{
		
		@Override
		public void run() {
			for(int i=0;i<=1000;i++) {
				System.out.println("작업3");
			}
		}
		
	}

 

public class projectA16 {

	public static void main(String[] args) {
		th a =new th();
		th1 b= new th1();
		th2 c=new th2();
		
		a.start();
		b.start();
		c.start();

	}

}
