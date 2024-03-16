package ch.stg.threads;

public class Duration {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        Thread.sleep(java.time.Duration.ofSeconds(5));
        System.out.println("Ende");
    }
}

