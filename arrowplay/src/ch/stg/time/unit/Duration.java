package ch.stg.time.unit;

import java.util.concurrent.TimeUnit;

public class Duration {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start 1");
        Thread.sleep(java.time.Duration.ofSeconds(5));
        System.out.println("Gate 1");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ende");
        System.out.println(TimeUnit.DAYS.toHours(1));
    }
}

