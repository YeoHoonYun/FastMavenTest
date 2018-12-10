package my.examples.javaexam;

import java.util.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class CollectionTest04 {
    // 1~45 숫자를 순서대로 저장
    // (100번 돌리기) 랜덤한 위치의 값을 2개 꺼내고, 2개의 것을 바꾼다.
    // 0~5번쨰 까지 출력하기

    public static void main(String[] args) {
//        -------------------------------------------------------
//        List<Integer> numList = new ArrayList<>();
//        for (int i=1; i <= 45; i++) {
//            numList.add(i);
//        }
//        System.out.println("원래 리스트 : " + numList);
//
//        for(int i=0; i <100;i++) {
//            int r1 = (int) (Math.random() * 45);
//            int r2 = (int) (Math.random() * 45);
//            Collections.swap(numList, r1, r2);
//        }
//        System.out.println("바뀐 리스트 : " + numList);
//
//        for(int i=0; i < 6; i++){
//            System.out.println(i+"번쨰 : "+numList.get(i));
//        }
//        ------------------------------------------------------

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 45; i++){
            //list.add(new Integer(i));
            list.add(i);
        }
        //Math.random() 0.0 <= x < 1.0 작은 실수
        int index1 = 0;
        int index2 = 0;

        //Collections.shuffle(list);
        for(int i = 0; i< 1000; i++){
            index1 = (int)(Math.random() * 45);
            index2 = (int)(Math.random() * 45);
            if(index1 != index2){
                Integer tmp = list.get(index1);
                list.set(index1, list.get(index2));
                list.set(index2, tmp);
            }
        }

        for(int i = 0; i<6; i++){
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }
}
