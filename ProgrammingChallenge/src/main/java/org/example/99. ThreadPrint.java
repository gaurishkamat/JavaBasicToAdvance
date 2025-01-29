package org.example;

class ThreadPrint extends Thread {

    private final String threadName;

    @Override
    public void run() {
        int i = 0;
        while(i<10){
            System.out.printf("Hello from thread %s\n", threadName);
            i++;
        }
    }

    public ThreadPrint(String threadName) {
        this.threadName = threadName;
    }

    static class ThreadTest{
        public static void main(String[] args) {
            double startTime = System.currentTimeMillis();
            Thread thread1 = new ThreadPrint("thread1");
            Thread thread2 = new ThreadPrint("thread2");

            thread2.setPriority(Thread.MAX_PRIORITY);
            thread1.start();
            thread2.start();

            double endTime = System.currentTimeMillis();

            System.out.printf("Finished in %f millis\n", endTime - startTime);
        }
    }
}
