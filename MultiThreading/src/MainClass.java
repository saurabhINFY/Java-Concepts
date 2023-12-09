public class MainClass {
    static int count =0;
    public static void main(String[] args) {
        Runnable runnableTask = () -> {
            for(int i=0;i<1000;i++){
                System.out.println("Thread Id:- "+Thread.currentThread().getId() + " Thread Name:- "+Thread.currentThread().getName() + " count is:- "+count);
                count++;
            }
        };
        Thread thread1 = new Thread(runnableTask);
        Thread thread2 = new Thread(runnableTask);

       thread1.start();
       thread2.start();

    }
}