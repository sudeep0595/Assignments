
public class AlternateWholeNumbers {

	public static void main(String[] args) {
		int b=6;
		for(int a=8;a<=13;a++) {
			while(b>=1) {
				System.out.print(a+" "+b+" ");
				b--;
				break;
			}
		}
	}
}
		
		
		/*PrintNum t1 = new PrintNum(true);
		PrintNum t2 = new PrintNum(false);
		t1.start();
		t2.start();*/	
	
/*

class TaskEvenOdd implements Runnable {
	@Override
    public void run() {

        //System.out.println("Run method");
        int number = isEvenNumber == true ? 2 : 1;
        while (number <= max) {

            if (isEvenNumber) {
                //System.out.println("Even :"+ Thread.currentThread().getName());
                print.printEven(number);
                //number+=2;
            } else {
                //System.out.println("Odd :"+ Thread.currentThread().getName());
                print.printOdd(number);
                // number+=2;
            }
            number += 2;
        }

    }

}

class Printer {

    boolean isOdd = false;

    synchronized void printEven(int number) {

        while (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even:" + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd:" + number);
        isOdd = true;
        notifyAll();
    }

}*/