package my.examples.javaexam.student;

import my.examples.javaexam.student.Strudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class StudentUI {
    private List<Strudent> strudentList;
    private Scanner scanName;
    public StudentUI(){
        strudentList = new ArrayList<>();
        scanName = new Scanner(System.in);
    }

    public Strudent inputStudent(){
        Strudent student = new Strudent();
        System.out.print("이름을 입력하세요. : ");
        String name = scanName.next();
        student.setName(name);
        System.out.print("영어 점수을 입력하세요. : ");
        int enName = scanName.nextInt();
        student.setEng(enName);
        System.out.print("국어 점수을 입력하세요. : ");
        int gukName = scanName.nextInt();
        student.setKor(gukName);
        System.out.print("수학 점수을 입력하세요. : ");
        int maName = scanName.nextInt();
        student.setMath(maName);

        return student;
    }

    public String intpuContinue(){
        System.out.println("---계속하시겠습니까?(Y/N).----");
        String selectStore = scanName.next();
        return selectStore;
    }
}
