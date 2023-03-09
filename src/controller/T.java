package controller;

public class T extends Thread {
	
	private int Thread;

	public T(int nThread) {
	this.Thread  = nThread;
		
	}
	public void run() {
		System.out.println(Thread);
	}
}