package my.examples.javaexam;

import my.examples.javaexam.car.Box;

/**
 * Created by jojoldu@gmail.com on 2018-12-09
 * Github : https://github.com/YeoHoonYun
 */
public class Exam05 {
    public static void main(String[] args){
        Box box = new Box();
        Item item1 = new Item();
        item1.x = 100;
        item1.y = 200;
        box.add(item1);
        Item i = box.get();
        System.out.println(i.x);
        System.out.println(i.y);
    }
}
