package view;

import controller.T;

public class Main {

	public static void main(String[] args) {
		for (int Thread = 0; Thread < 5; Thread++) {
			Thread ThreadA = new T(Thread);
			ThreadA.start();
			
			  
		}
	}

}
