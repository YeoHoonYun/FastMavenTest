package my.examples.repeart;

import java.util.ArrayList;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class Collection01 {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<String>();

        arrList.add("넷");
        arrList.add("둘");
        arrList.add("셋");
        arrList.add("하나");

        for(int i=0; i<arrList.size(); i++){
            System.out.println(arrList.get(i));
        }
    }
}
