package projectA15;
 
class hss implements Runnable{
	int tag=0;
	int sum=0;
     hss(int tag){
    	 this.tag=tag;
     }
     @Override
    public void run() {
    	if(tag==3) {
    		for(int i=0;i<=1000;i++) {
    			if(i%3==0) {
    				sum= sum+i;
    			}
    			}
    			System.out.println("3의 배수의합:"+sum);
    			
    		}else if (tag==4) {
    			for(int i=0;i<=1000;i++) {
    				if(i%4==0) {
    					sum= sum+i;
    				}
    			}
    				System.out.println("4의 배수의합:"+sum);
    			}else if(tag==5) {
    				for(int i=0;i<=1000;i++) {
    					if(i%5==0) {
    						sum= sum+i;
    					}
    				}
    				System.out.println("5의 배수의합:"+sum);
    				
    			}else if(tag==6) {
    				for(int i=0;i<=1000;i++) {
    					if(i%6==0) {
    						sum=sum+i;
    					}
    				}
    				System.out.println("6의 배수의합:"+sum);
    			}
    		}
	
}


public class projectA30 {

	public static void main(String[] args) {
		hss a=new hss(3);
		hss b=new hss(4);
		hss c=new hss(5);
		hss j =new hss(6);
		
		Thread d = new Thread(a);
		Thread f = new Thread(b);
		Thread g = new Thread(c);
		Thread k = new Thread(j);
		
		d.start();
		f.start();
		g.start();
		k.start();

	}

}
