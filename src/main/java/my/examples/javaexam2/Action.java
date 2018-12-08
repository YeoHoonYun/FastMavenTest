package my.examples.javaexam2;

/**
 * Created by jojoldu@gmail.com on 2018-12-09
 * Github : https://github.com/YeoHoonYun
 */
public abstract class Action {
    abstract void init();
    abstract void service();
    abstract void destroy();

    public void run(){
        init();
        service();
        destroy();
    }
}
