package my.examples.javaexam.car;

import my.examples.javaexam.Item;

/**
 * Created by jojoldu@gmail.com on 2018-12-09
 * Github : https://github.com/YeoHoonYun
 */
public class Box {
    private Item item;
    public void add(Item item){
        this.item = item;
        int tmp = this.item.x;
        this.item.x = this.item.y;
        this.item.y = tmp;
    }

    public Item get(){
        return item;
    }
}
