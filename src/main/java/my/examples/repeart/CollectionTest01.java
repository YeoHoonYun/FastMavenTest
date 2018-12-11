package my.examples.repeart;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class CollectionTest01 {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("!!!");
        set.add("!!!");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

//        Set<String> set = new HashSet<>();
//        set.add("hello");
//        set.add("!!!");
//        set.add("!!!");
//
//        Iterator<String> iterator = set.iterator();
//        while(iterator.hasNext()){
//            String str = iterator.next();
//            System.out.println(str);
//        }
    }
}
