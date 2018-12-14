package my.fastcamp.week_2.sudent2;

import java.util.Objects;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class Students implements Comparable<Students>{
    private String name;
    private Integer kor;
    private Integer eng;
    private Integer math;

    public Students(String name){
        this.name = name;
    }

    public Students(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public Integer getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name) &&
                Objects.equals(kor, students.kor) &&
                Objects.equals(eng, students.eng) &&
                Objects.equals(math, students.math);
    }
//    @Override
//    public boolean equals(Object o){
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Students students = (Students) o;
//
//        return this.getKor().equals(students.getKor()) &&
//                this.getMath().equals(students.getMath()) &&
//                this.getEng().equals(students.getEng()) &&
//                this.getName().equals(students.getName());
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, kor, eng, math);
    }

    @Override
    public int compareTo(Students o) {
        return this.getMath() - this.getMath();
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}
