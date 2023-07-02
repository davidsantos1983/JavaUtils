package thread;

import java.util.List;

public class ThreadsUtils {
	
	private ThreadsUtils() {
	}

    public static void runAll(List<Thread> threads) {

        for (Thread thread : threads) {

            thread.start();
        }
    }

    /**
     * @param threads
     * @return false return error, true all threads join;
     */
    public static boolean waitAll(List<Thread> threads) {

        for (Thread thread : threads) {

            try {

                thread.join();

            } catch (InterruptedException e) {

                return false;
            }
        }

        return true;
    }

    @SuppressWarnings("deprecation")
    public static void stopAll(List<Thread> threads) {

        try {

            for (Thread thread : threads) {

                thread.stop();
            }
        } catch (Exception e) {
            // Se der exception deu
        }
    }
}
