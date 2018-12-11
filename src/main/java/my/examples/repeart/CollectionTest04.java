package my.examples.repeart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class CollectionTest04 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 45; i++){
            list.add(i);
        }

        //Collections.shuffle(list);
        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < 1000; i++){
            index1 = (int)(Math.random() * 45);
            index2 = (int)(Math.random() * 45);
            if(index1 != index2){
                Integer tmp = list.get(index1);
                list.set(index1, list.get(index2));
                list.set(index2, tmp);
            }
        }

        for(int i = 0; i < 6; i++){
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }
}
