public class ThreadTest {
    public static void main(String[] args) {
        // MyThread myThread = new MyThread();
        // Thread thread = new Thread(myThread);
        // thread.start();
        long start = System.currentTimeMillis();
        testTheadTime();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void testTheadTime() {
        for (int i=0; i<10000; i++) {
            new Thread(new MyThread("testNoThreadPool"+Integer.toString(i))).start();
            // ThreadPool.getInstance().start(new MyThread("testThreadPool"+Integer.toString(i)));
        }
    }
}
