package my.fastcamp.happyjava;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class chap15 {
    public static void main(String[] args) {
        //toString()은 말그대로 객체가 갖고 있는 값을 문자열로 바꿔서 반환.

        //equals() 값을 비교하는 메소드
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        if(str1 == str2){
            System.out.println("dice1 == dice2");
        }

        else if (str1.equals(str3)){
            System.out.println("dic");
        }
        //String / toString
        String str = "hello " + "world";
        System.out.println(str);

        String str_3 = new StringBuffer().append("hello ").append("world").toString();

        String str_4 = "";
        for (int i =0; i< 100; i++){
            str_4 = new StringBuilder().append(str2).append("*").toString();
        }
        System.out.println(str_4);

        long start1 = System.nanoTime(); //시작 시간 (1초를 1000000)
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 100; i++){
            sb.append("*");
        }
        System.out.println(sb.toString());
        long end1 = System.nanoTime(); // 종료 시간
        System.out.println(end1 - start1);

        //String은 불변
        // 되도록이면 + 연산자로 하는 것보다 Buffer나 Builder를 사용
        //정규표현식
        System.out.println(str_4);
        System.out.println(str_4.substring(3));
    }




}
