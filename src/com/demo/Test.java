package com.demo;

public class Test implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			Thread first = new Thread(new Test());
			first.start();
		}

	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName() + "number " + i);
		}
	}

}
