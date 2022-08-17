package projectA15;


class Value {
	static int i=0;
}

class the extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Test");
			i++;
		}
	}
}
class the2 extends Thread{
	
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Send");
			i++;
		}
	}
}
class the3 extends Thread{
	
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Read");
			i++;
		}
	}
}

public class projectA21 {

	public static void main(String[] args) {
		the a= new the();
		the2 b= new the2();
		the3 c= new the3();
		
		a.start();
		b.start();
		c.start();
		
	}

}
