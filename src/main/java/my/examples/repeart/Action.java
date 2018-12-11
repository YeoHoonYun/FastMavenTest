package my.examples.repeart;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public abstract class Action {
    void init(){
        System.out.println("init!!!");
    }
    protected abstract void service();

    void destroy(){
        System.out.println("destroy!!");
    }

    public final void run(){
        init();
        service();
        destroy();
    }
}
