package my.examples.repeart;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class Exam07 {
    public static void main(String[] args){
        GenericBox<Integer> box = new GenericBox<>();
        box.set(new Integer(5));
        Integer int1 = box.get();
        System.out.println(int1.toString());
    }
}
