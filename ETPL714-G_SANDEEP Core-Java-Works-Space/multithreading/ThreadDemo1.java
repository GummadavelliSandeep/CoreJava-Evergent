package com.evergent.corejava.multithreading;
 class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			try {
				Thread.sleep(100);
				System.out.println("Thread name: "+Thread.currentThread().getName());
				
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Excception caught:");
			}
			System.out.println(i);
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		try {
			System.out.println("The current method:"+Thread.currentThread().getName());
			t1.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Exception caught:");
		}
		t2.start();
		try {
			System.out.println("The current method:"+Thread.currentThread().getName());
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Exception caught:");
		}

	}

}
