package my.fastcamp.week_2.student;

import java.util.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class StudentManager {
    List<Student> studentList;
    List<Integer> korList, engList, mathList;
    private HashMap<String,List<Integer>> subList;

    public StudentManager(){
        studentList = new ArrayList<>();
        subList = new HashMap<>();
        korList = new ArrayList<>();
        engList = new ArrayList<>();
        mathList = new ArrayList<>();

        subList.put("kor", korList);
        subList.put("eng", engList);
        subList.put("math", mathList);
    }

    public void addStudent(Student student){
        studentList.add(student);
        korList.add(student.getKor());
        engList.add(student.getEng());
        mathList.add(student.getMath());

    }

    public Iterator<Student> iterator(){
        return studentList.iterator();
    }

    public int getKorTotal(){
        Integer result =0;
        for (Integer i : subList.get("kor")){
            result += i;
        }
        return result;
    }

    public Integer getMathTotal(){
        Integer result =0;
        for (Integer i : subList.get("math")){
            result += i;
        }
        return result;
    }

    public Integer getEngTotal(){
        Integer result =0;
        for (Integer i : subList.get("eng")){
            result += i;
        }
        return result;
    }

    public double getKorAvg(){
        return getKorTotal() / (double)studentList.size();
    }

    public double getEngAvg(){
        return getEngTotal() / (double)studentList.size();
    }

    public double getMathAvg(){
        return getMathTotal() / (double)studentList.size();
    }
}

