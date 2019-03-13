public interface Timer {

    int schedule(Runnable runnable, int delay);

    void stop(int index);

}
