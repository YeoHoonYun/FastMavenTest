package my.examples.javaexam;

import my.examples.ObjectBox;

/**
 * Created by jojoldu@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class Exam06 {
    public static void main(String[] args){
        ObjectBox objectBox = new ObjectBox();
//        Integer int1 = new Integer(5);
        Double int1 = new Double(50.5);
        objectBox.set(int1);
        Integer int2 = (Integer)objectBox.get(); //형변환은 Object의 계층구조로 있는걸로 가능
        System.out.println(int2.toString());
    }
}

//ObjectBox 클래스 생성