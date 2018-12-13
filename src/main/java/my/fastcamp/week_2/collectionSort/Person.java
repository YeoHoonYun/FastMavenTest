package my.fastcamp.week_2.collectionSort;

import java.util.Comparator;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class Person implements Comparable<Person> {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Person의 age로 정렬
    @Override
    public int compareTo(Person p){
        if(this.age > p.age){
            return 1;
        }
        else if(this.age < p.age){
            return -1;
        }else{
            return 0;
        }

    }
}
