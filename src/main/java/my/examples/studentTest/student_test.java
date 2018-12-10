package my.examples.studentTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class student_test {
    public static void main(String[] args){
        List<students> stu_list = new ArrayList<>();
        double totalEn = 0;
        double totalMa = 0;
        double totalGu = 0;
        double totalScore = 0;

        while (true) {
            students students = new students();
            Scanner scanName = new Scanner(System.in);
            System.out.print("이름을 입력하세요. : ");
            String name = scanName.next();
            students.setName(name);
            System.out.print("영어 점수을 입력하세요. : ");
            int enName = scanName.nextInt();
            students.setEnScore(enName);
            System.out.print("국어 점수을 입력하세요. : ");
            int gukName = scanName.nextInt();
            students.setGukScore(gukName);
            System.out.print("수학 점수을 입력하세요. : ");
            int maName = scanName.nextInt();
            students.setMaScore(maName);

            stu_list.add(students);

            System.out.println("---계속하시겠습니까?(Y/N).----");
            String selectStore = scanName.next();
            if (selectStore.equalsIgnoreCase("N") || selectStore.equalsIgnoreCase("n")) {
                break;
            }
            else if (selectStore.equalsIgnoreCase("y") || selectStore.equalsIgnoreCase("Y")) {
                continue;
            }
            else {
                System.out.println("잘못된 인수입니다. 프로그램을 종료합니다.");
                break;
            }
        }
        System.out.println("입력된 학생들의 점수표");
        System.out.println("이름\t\t국어\t\t\t영어\t\t\t수학\t\t\t총합\t\t\t평균");
        for(students stu : stu_list){
            System.out.println(String.format("%s\t%s\t\t%s\t\t%s\t\t%s\t\t%s",stu.getName(),stu.getGukScore(),stu.getEnScore(),stu.getMaScore(),stu.getTotalScore(),String.format("%.1f",stu.getAvgScore())));
            totalGu += stu.getGukScore();
            totalEn += stu.getEnScore();
            totalMa += stu.getMaScore();
            totalScore = totalEn + totalGu + totalMa;
        }
        System.out.println(String.format("%s\t\t%s\t\t%s\t\t%s\t\t%s","총점",totalGu,totalEn,totalMa,totalScore));
        System.out.println("총평균"+"\t"+String.format("%.1f",totalGu/3)+"\t\t"+String.format("%.1f",totalEn/3)+"\t\t"+String.format("%.1f",totalMa/3));
    }
}
