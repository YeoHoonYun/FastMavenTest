package my.examples.javaexam;

import java.util.*;

/**test
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class CollectionTest01 {
    public static void main(String[] args){
//        Collection<String>  collection = new HashSet<String>();
        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("!!!");
        set.add("!!!");

        boolean flag = false;
        flag = set.add("hello2");
        System.out.println(flag);
        flag = set.add("!!!!");
        System.out.println(flag);
        flag = set.add("!!!!"); //false를 리턴한다.
        System.out.println(flag);


        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

//        Collection<String>  collection2 = new ArrayList<String>();
//        collection2.add("hello");
//        collection2.add("world");
//        collection2.add("!!!");
//
//        Iterator<String> iterator2 = collection2.iterator();
//        while(iterator2.hasNext()){
//            String str = iterator2.next();
//            System.out.println(str);
//        }
    }
}
