package my.examples.javaexam;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */

//제네릭 타입 - 타입이 아직 정해지지 않음.
public class GenericBox<T> {
    private T obj;
    public void set(T obj){
        this.obj = obj;
    }

    public T get(){
        return obj;
    }
}
