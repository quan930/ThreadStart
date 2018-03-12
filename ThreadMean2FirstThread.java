package Thread;

public class ThreadMean2FirstThread implements Runnable {
	long minPrime;
	ThreadMean2FirstThread(long minPrime) {
		this.minPrime = minPrime;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("乌龟！！");
	}

}
