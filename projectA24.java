package projectA15;

class bs extends Object implements Runnable {
	     
	 @Override
	public void run() {
		 int i=0;
			do {//run
				System.out.println("Read");
				i++;
				
			}while(i<1000);

		
	}
}

class bs1 extends Thread{
	@Override
	public void run() {
		int i=0;
		do {
			System.out.println("write");
			i++;
		}while(i<1000);
	}
}

class bs2 extends Object implements Runnable{
	@Override
	public void run() {
		int i=0;
		do {
			System.out.println("send");
			i++;
		}while(i<1000);
		
	}
	
}
public class projectA24 {

	public static void main(String[] args) {
       Thread t1 = new Thread(new bs());	
       bs1 t2 = new bs1(); 
       Thread t3 = new Thread(new bs2());
       
       t1.start();
       t2.start();
       t3.start();

		
	}

}
