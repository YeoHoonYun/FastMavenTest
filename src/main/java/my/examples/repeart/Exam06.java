package my.examples.repeart;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class Exam06 {
    public static void main(String[] args){
        ObjectBox objectBox = new ObjectBox();
        //Integer int1 = new Integer(5);
        Double int1 = new Double(50.5);
        objectBox.set(int1);
        Double int2 = (Double)objectBox.get();
        System.out.println(int2.toString());
    }
}
