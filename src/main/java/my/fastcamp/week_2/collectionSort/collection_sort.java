package my.fastcamp.week_2.collectionSort;

import java.util.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class collection_sort {
    public static void main(String[] args) {
        //기본 제너릭과 관련된 함수는 아래와 같이 작성
        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(6);
        integerList.add(2);
        integerList.add(10);

        // Collections.sort(List<T> list);
        Collections.reverse(integerList);

        System.out.println(integerList);

        // Person 객체 정렬
        List<Person> nameList = new ArrayList<>();

        nameList.add(new Person("Heo", 28));
        nameList.add(new Person("Lee", 24));
        nameList.add(new Person("Choi", 26));
        System.out.println("- 정렬 전" + nameList);
        Collections.sort(nameList);
        System.out.println("- 정렬 후" + nameList);

        List<SoccerPlayer> playerArray = new ArrayList<SoccerPlayer>();

        playerArray.add(new SoccerPlayer("메시","다",23));
        playerArray.add(new SoccerPlayer("호날두","가",25));
        playerArray.add(new SoccerPlayer("줄라탄","나",26));
        playerArray.add(new SoccerPlayer("박지성","마",30));
        playerArray.add(new SoccerPlayer("오스카","바",21));

        Collections.reverse(playerArray);
        for(SoccerPlayer sp : playerArray){
            System.out.println(sp.getName());
        }
    }
}
