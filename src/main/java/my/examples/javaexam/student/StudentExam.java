package my.examples.javaexam.student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class StudentExam {
    public static void main(String[] args) {
        StudentUI strudentUI = new StudentUI();
        List<Strudent> strudentList = new ArrayList<>();
        while(true){
            strudentList.add(strudentUI.inputStudent());
            String selectStore = strudentUI.intpuContinue();
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
        System.out.println(strudentList.size());
        for (int i=0;i<strudentList.size();i++){
            System.out.print(strudentList.get(i).getName()+ " ");
            System.out.print(strudentList.get(i).getKor()+ " ");
            System.out.print(strudentList.get(i).getMath()+ " ");
            System.out.println(strudentList.get(i).getEng()+ " ");
        }
        StudentManager studentManager = new StudentManager(strudentList);
        System.out.println(studentManager.Sum() +" | " +studentManager.Avg());
    }
}
