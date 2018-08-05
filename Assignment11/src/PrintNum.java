
public class PrintNum extends Thread{
boolean a;
int k=8,m=6;
public PrintNum(boolean a) {
	super();
	this.a = a;
}
@Override
	public void run() {
		if(a) {
			System.out.print(k+" ");
			k++;
			try {
				wait();
				notifyAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.print(m+" ");
			m--;
			try {
				wait();
				notifyAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
