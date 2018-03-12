package Thread;

public class ThreadMean1FirstThread extends Thread {
	long minPrime;//生命周期
	ThreadMean1FirstThread(long minPrime) {
		this.minPrime = minPrime;
	}
	@Override
	public void run() {  
		System.out.println("乌龟！");
	} 
}
