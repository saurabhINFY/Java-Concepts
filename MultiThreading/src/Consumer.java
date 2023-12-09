public class Consumer {
    public void consume(){
        System.out.println("I'm consumer and consuming with thread id "+ Thread.currentThread().getId());
    }
    public void decrement(int num){
        if(num!=0){
            num--;
        }
    }
}
