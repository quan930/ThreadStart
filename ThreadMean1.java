package Thread;
/*
 * 继承方法创建线程
 */
public class ThreadMean1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThreadMean1FirstThread myThread1 = new ThreadMean1FirstThread();  
		//ThreadMean1SecondThread myThread2 = new ThreadMean1SecondThread(); 
		//myThread1.start();  
		//myThread2.start();
		new ThreadMean1FirstThread(134).start();
		ThreadMean1SecondThread myThread = new ThreadMean1SecondThread(178);
		myThread.start();
	}
}