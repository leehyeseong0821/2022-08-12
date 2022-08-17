package projectA15;

class hs extends Thread{
	int tag=0;
	hs(int tag){
		this.tag=tag;
		
	}
	@Override
	public void run() {
		if(tag==1) {
			int sum=0;
			for(int i=0;i<=1000;i++) {
				if(i%2!=0) {
					sum= sum+i;
				}
			}
			System.out.println("홀수의합:"+sum);
		}else if(tag==2) {
			int sum=0;
			for(int i=0;i<=1000;i++) {
				if(i%2==0) {
					sum= sum+i;
				}
			}
			System.out.println("짝수의합:"+sum);
		}
		
	}
	
	
}

public class projectA28 {

	public static void main(String[] args) {
		 hs a=new hs(1);
		 hs b=new hs(2);
		 
		 a.start();
		 b.start();

	}

}
