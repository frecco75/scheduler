public class Main {

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new TimerImpl();

        timer.schedule(() -> System.out.println("azer"), 100);
        timer.schedule(() -> System.out.println("qsdf"), 200);

        Thread.sleep(2000);

        timer.stop(0);
        timer.stop(1);
    }
}
