package com.evergent.corejava.multithreading;
 class MyThread2 implements Runnable{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread m1=new MyThread();
		Thread t1=new Thread(m1);
		t1.start();
		MyThread m2=new MyThread();
		Thread t2=new Thread();
		t2.start();

	}

}
