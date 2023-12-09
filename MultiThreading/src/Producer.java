public class Producer {
    public void produce(){
        System.out.println("I'm producer and producing with thread id "+ Thread.currentThread().getId());
    }
    public void increment(int num){
        num++;
    }
}
