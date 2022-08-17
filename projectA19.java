package projectA15;


class Ts implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("안녕하세요");
		}
		
	}
	
}
class Ts1 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<200;i++) {
			System.out.println("Hi");
		}
		
	}
}
class Ts2 implements Runnable{
	@Override
	public void run() {
		  for(int i=0;i<300;i++) {
			  System.out.println("방가워요");
		  }
		
	}
	
}


public class projectA19 {

	public static void main(String[] args) {
		Ts a1 = new Ts();
		Ts1 a2 = new Ts1();
		Ts2 a3 = new Ts2();
		
		Thread b1 = new Thread(a1);
		Thread b2 = new Thread(a2);
		Thread b3 = new Thread(a3);
		
		b1.start();
		b2.start();
		b3.start();
		
		
		
	}

}
