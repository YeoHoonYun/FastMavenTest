package my.fastcamp.week_2.collectionSort;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class SoccerPlayer implements Comparable<SoccerPlayer> {
    private String name;
    private String position;
    private int age;

    public SoccerPlayer(String name, String position, int age){
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //SoccerPlayer의 이름으로 오름차순
    @Override
    public int compareTo(SoccerPlayer o) {
        return name.compareTo(o.getName());
    }
}
