package com.thread;

class MyThread extends Thread {
	static String message[] = { "sg", "tech", "private", "limited" };

	public MyThread(String id) {
		super(id);
	}

	public void run() {
		sync.displaylist(getName(), message);
	}

	void waiting() {
		try {
			sleep(2000);
		} catch (Exception e) {
		}
	}
}

class sync {
	public static synchronized void displaylist(String name, String list[]) {
		for (int i = 0; i < list.length; i++) {
			MyThread T = (MyThread) Thread.currentThread();
			T.waiting();
			System.out.println(name + "  " + list[i]);
		}
	}
}

class Threadsync {
	public static void main(String arg[]) {
		MyThread T1 = new MyThread("Thread 1 :");
		MyThread T2 = new MyThread("Thread 2 :");
		T1.start();
		T2.start();
	}
}
