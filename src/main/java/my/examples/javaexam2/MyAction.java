package my.examples.javaexam2;

/**
 * Created by jojoldu@gmail.com on 2018-12-09
 * Github : https://github.com/YeoHoonYun
 */
public class MyAction extends Action{
    void init(){
        System.out.println("init");
    }
    void service(){
        System.out.println("service");
    }
    void destroy(){
        System.out.println("destroy");
    }
}
