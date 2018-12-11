package my.examples.repeart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class CollectionTest02 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("!!!");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
