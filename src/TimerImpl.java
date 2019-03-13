import java.util.ArrayList;
import java.util.List;

public class TimerImpl implements Timer {

    private final List<Task> tasks = new ArrayList<>();

    @Override
    public int schedule(Runnable runnable, int delay) {
        Task task = new Task(runnable, delay);
        task.start();
        tasks.add(task);
        return tasks.size();
    }

    @Override
    public void stop(int index) {
        tasks.get(index).stop();
    }
}
