package my.fastcamp.week_2.sudent2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class StudentExam {
    public static void main(String[] args) {
        List<Students> studentsList = new ArrayList<Students>();
        studentsList.add(new Students("Aim",100,100,10));
        studentsList.add(new Students("Aim",100,100,20));
        studentsList.add(new Students("Aim",100,50,30));
        studentsList.add(new Students("bim",100,50,40));
        studentsList.add(new Students("dim",50,100,50));
        studentsList.add(new Students("dim",50,50,60));
        studentsList.add(new Students("eim",20,10,70));
        studentsList.add(new Students("fim",20,50,80));
        studentsList.add(new Students("gim",20,45,90));

        Students students1 = new Students("Aim",100,100,100);
        Students students2 = new Students("Aim",100,100,100);
        Students students3 = new Students("Aim",50,50,50);

        //
        System.out.println(students1.equals(students2));
        System.out.println(students1.equals(students3));

        Collections.sort(studentsList);
        for (Students s : studentsList){
            System.out.println(s);
        }
        System.out.println("---------------------reverse-----------------------");
        Collections.reverse(studentsList);
        for (Students s : studentsList){
            System.out.println(s);
        }

        System.out.println("---------------------Name-----------------------");
        Collections.sort(studentsList, new CompareName());
        for (Students s : studentsList){
            System.out.println(s);
        }

        System.out.println("---------------------Kor-----------------------");
        Collections.sort(studentsList, new CompareKor());
        for (Students s : studentsList){
            System.out.println(s);
        }

        System.out.println("---------------------Eng-----------------------");
        Collections.sort(studentsList, new CompareEng());
        for (Students s : studentsList){
            System.out.println(s);
        }

        System.out.println("---------------------Math-----------------------");
        Collections.sort(studentsList, new CompareMath());
        for (Students s : studentsList){
            System.out.println(s);
        }

        System.out.println("---------------------Name---------------------");
        Collections.sort(studentsList, ((o1, o2) -> {return o1.getName().compareTo((o2.getName()));}));
        for (Students s : studentsList){
            System.out.println(s);
        }
    }
}

class CompareName implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class CompareKor implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getKor().compareTo(o2.getKor());
    }
}
class CompareEng implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getEng().compareTo(o2.getEng());
    }
}
class CompareMath implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getMath().compareTo(o2.getMath());
    }
}