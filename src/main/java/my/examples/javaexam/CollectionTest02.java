package my.examples.javaexam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //되도록이면 앞에 인터페이스 타입을 설정하는게 좋다.
        list.add("hello");
        list.add("world");
        list.add("!!!");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
