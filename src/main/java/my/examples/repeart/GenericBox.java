package my.examples.repeart;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class GenericBox<T> {
    public T obj;
    public void set(T obj){
        this.obj = obj;
    }

    public T get(){
        return obj;
    }
}
