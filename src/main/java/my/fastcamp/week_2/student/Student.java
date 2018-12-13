package my.fastcamp.week_2.student;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class Student {
    private String name;
    private Integer kor;
    private Integer eng;
    private Integer math;

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int kor, int eng, int math){
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

    public String toString(){
        return name + ":" + kor + ":" + eng + ":" + math;
    }
}
