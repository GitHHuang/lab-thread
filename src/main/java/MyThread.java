public class MyThread implements Runnable {

    protected String name;

    public MyThread() {
    }

    public MyThread(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run() {
        try {
            // 使用sleep方法代替一个具体功能的执行
            // System.out.println("asleep");
            Thread.sleep(100);
            // System.out.println("wakeup");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
