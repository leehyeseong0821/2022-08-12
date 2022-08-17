package projectA15;

class max extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<101;i++) {
			System.out.println(i);
		}
	}
	
}
class max1 extends Thread{
	
	@Override
	public void run() {
		for(int i=101;i<201;i++) {
			System.out.println(i);
		}
	}
}
class max2 extends Thread{
	@Override
	public void run() {
		for(int i=201;i<301;i++) {
			System.out.println(i);
		}
	}
	
}
public class projectA26 {

	public static void main(String[] args) {
		max ma= new max();
		max1 ma1= new max1();
		max2 ma2 =new max2();
		ma.start();
		ma1.start();
		ma2.start();

	}

}
