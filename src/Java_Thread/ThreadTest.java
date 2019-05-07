package Java_Thread;

/**
 * Created by xql on 2019/3/5.
 */
public class ThreadTest extends Thread{
    private int i;

    @Override
    public void run() {
        for(;i<100;i++){
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            System.out.println(currentThread()+" "+i);
            if(i==20){
                new ThreadTest().start();
                new ThreadTest().start();
            }
        }
    }
}
