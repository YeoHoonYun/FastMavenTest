package my.examples.javaexam;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class Exam07 {
    public static void main(String[] args){
        GenericBox<Double> box = new GenericBox(); // 가상의 타입을 Integer로 사용하겠다.
        box.set(new Double(5.2));
        Double int1 = box.get();
        System.out.println(int1.toString());
    }
}
