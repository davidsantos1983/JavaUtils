package thread;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ThreadsUtilsTest {

	@Test
	void testAll() {

		List<Thread> threads = new ArrayList<>();
		threads.add(new MyThread());
		threads.add(new MyThread());
		threads.add(new MyThread());

		ThreadsUtils.runAll(threads);
		Assert.assertEquals(true, true);
		
		Assert.assertEquals(true, ThreadsUtils.waitAll(threads));
		
		ThreadsUtils.stopAll(threads);
		Assert.assertEquals(true, true);
	}

	private class MyThread extends Thread {

		public void run() {
		}
	}
}
