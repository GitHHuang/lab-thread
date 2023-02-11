import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        testTheadTime();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void testTheadTime() {
        // 扩展ThreadPoolExecutor
        // ExecutorService exe = new MyThreadPoolExecutor(0, Integer.MAX_VALUE,
        //         60L, TimeUnit.SECONDS,
        //         new SynchronousQueue<Runnable>());
        ExecutorService exe = Executors.newCachedThreadPool();
        for (int i=0; i<10000; i++) {
            exe.execute(new MyThread("testJDKThreadPool"+Integer.toString(i)));
        }
    }
}
