package problem_solving.cron_job;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledJob {
    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    static void main() throws InterruptedException {
        ScheduledJob scheduledJob = new ScheduledJob();
        scheduledJob.printTimeEveryFiveSeconds();
        Thread.sleep(15_000);
        scheduledJob.stopTask();
    }

    public void printTimeEveryFiveSeconds() {
        Runnable task = () -> System.out.println(LocalDateTime.now());
        scheduledExecutorService.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }

    public void stopTask() {
        scheduledExecutorService.shutdown();
    }
}
