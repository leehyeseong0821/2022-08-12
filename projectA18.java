package projectA15;

class se extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("안녕하세요");
		}
	}
	
}
class se1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<200;i++) {
			System.out.println("Hi");
		}
	}
	
}
class se2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.println("반가워요");
		}
	}
	
}
public class projectA18 {
public static void main(String[] args) {
	se a = new se();
	se1 b = new se1();
	se2 c = new se2();
	
	a.start();
	b.start();
	c.start();
	
}
}
