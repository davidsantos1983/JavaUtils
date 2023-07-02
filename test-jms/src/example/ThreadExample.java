package example;

import java.util.ArrayList;
import java.util.List;

import thread.ThreadsUtils;

public class ThreadExample {

	public static void main(String[] args) {

		ThreadExample temp = new ThreadExample();
		
		List<Thread> threads = new ArrayList<>();
		threads.add(temp.new MyThread());
		threads.add(temp.new MyThread());
		threads.add(temp.new MyThread());
		ThreadsUtils.runAll(threads);
	}

	private class MyThread extends Thread {

		public void run() {
			System.out.println("MyThread!!!");
		}
	}
}
