public class Task {
    private final Thread thread;
    private boolean run;

    Task(Runnable runnable, int delay) {
        run = true;
        long now = System.currentTimeMillis();
        Runnable runnableWithDelay = () -> {
            while (run) {
                if ((System.currentTimeMillis() - now) % delay == 0) {
                    runnable.run();
                }
            }
        };

        thread = new Thread(runnableWithDelay);
    }

    void start() {
        thread.start();
    }

    void stop() {
        run = false;
    }

}
