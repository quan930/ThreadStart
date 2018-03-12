package Thread;

public class ThreadMean1SecondThread extends Thread {
	long minPrime;//生命周期
	ThreadMean1SecondThread(long minPrime) {
		 this.minPrime = minPrime;
	}
	@Override
	public void run() {  
		System.out.println("兔子！");  
	} 
}