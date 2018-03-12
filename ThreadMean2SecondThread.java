package Thread;

public class ThreadMean2SecondThread implements Runnable{
	long minPrime;
	ThreadMean2SecondThread(long minPrime) {
		this.minPrime = minPrime;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("兔子！！");
	}

}
