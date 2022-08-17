package projectA15;

class js extends Thread{
	
	@Override
	public void run() {
		int i=0;
		int sum=0;
		for(;;) {
			if(i==100) {
				break;
			}
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			i++;
			sum= sum+i;
		}
		System.out.println("for1:"+sum);
	}
	
}
class js1 extends Thread{
	
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<1000;i++) {
			sum=sum+i;
			try {
				sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("for2:"+sum);
	}
	
}
public class projectA25 {

	public static void main(String[] args) {
		js j=new js();
		js1 k=new js1();
		
		j.start();
		k.start();

	}

}
