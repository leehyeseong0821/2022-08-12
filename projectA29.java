package projectA15;

class jy extends Thread{
	int tag=0;
	int sum=0;
	jy(int tag){
		this.tag=tag;
			
	}
	@Override
	public void run() {
		if(tag==3) {
			for(int i=1;i<=1000;i++) {
				if(i%3==0) {
					sum= sum+i;
				}
			}
			System.out.println("3의 배수합:"+sum);
		}
	}
	
	
}
class jy1 extends Thread{
	int tag=0;
	int sum=0;
	jy1(int tag){
		this.tag=tag;
		
	}
	@Override
	public void run() {
		if(tag==4) {
			for(int i=1;i<=1000;i++) {
				if(i%4==0) {
					sum=sum+i;
					
				}
			}
			System.out.println("4의 배수합:"+sum);
		}
	
	}
}
class jy3 extends Thread{
	int tag=0;
	int sum=0;
	jy3(int tag){
		this.tag=tag;
	}
	@Override
	public void run() {
		if(tag==5) {
			for(int i=1;i<=1000;i++) {
				if(i%5==0) {
					sum=sum+i;
				}
			}
			System.out.println("5의 배수의합:"+sum);
		}
	}
	
	
}

public class projectA29 {

	public static void main(String[] args) {
		jy a = new jy(3);
		jy1 b = new jy1(4);
		jy3 c = new jy3(5);
		a.start();
		b.start();
		c.start();

	}

}
