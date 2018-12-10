package my.examples;

/**
 * Created by jojoldu@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class ObjectBox {
    private Object obj; // 필드

    public void set(Object obj) { // Object, Number
        this.obj = obj;
        //obj = obj; //
    }

    public Object get(){
        return obj;
    }
}
// Object 클래스는 모든 클래스의 최고 조상
// 아무것도 상속받지 않으면 자동으로 Object를 상속받는다.
// public class ObjectBox
// public class ObjectBox extends Object
// Object obj = new ObjectBox();