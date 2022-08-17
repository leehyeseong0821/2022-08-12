package projectA15;
 

class js12 implements Runnable{
	
	int count=0;
	js12(int count){
		this.count=count;
	}
	@Override
	public void run() {
		for(int i=0;i<=this.count;i++) {
			System.out.println(i);
		}
		
	}
	
}
class js13 implements Runnable{
	int count=0;
	js13(int count){
		this.count=count;
	}
	@Override
	public void run() {
		for(int i=this.count;i>=1;i--) {
			System.out.println(i);
		}
		
	}
	
	
}
public class projectA27 {

	public static void main(String[] args) {
		js12 jss=new js12(100);
		js13 jsa=new js13(200);
		
		Thread a=new Thread(jss);
		Thread b=new Thread(jsa);
		a.start();
		b.start();
		

	}

}
