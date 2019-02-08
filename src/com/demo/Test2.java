package com.demo;

public class Test2 extends Thread{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Test2(), "t1");
		Thread t2 = new Thread(new Test2(), "t2");
		Thread t3 = new Thread(new Test2(), "t3");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
