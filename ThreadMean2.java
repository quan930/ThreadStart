package Thread;

public class ThreadMean2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadMean2FirstThread myThread1 = new ThreadMean2FirstThread(143);
		ThreadMean2SecondThread myThread2 = new ThreadMean2SecondThread(186);
		new Thread(myThread1).start();
		Thread thread2 = new Thread(myThread2);
		thread2.start();
	}
}
