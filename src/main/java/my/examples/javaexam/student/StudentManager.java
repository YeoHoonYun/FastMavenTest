package my.examples.javaexam.student;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class StudentManager {
    private List<Strudent> strudentList;
    private int total = 0;
    public StudentManager(List<Strudent> students){
        strudentList = students;
    }
    public int Sum(){

        for (int i=0; i<strudentList.size();i++){
            total = strudentList.get(i).getKor()+strudentList.get(i).getEng()+strudentList.get(i).getMath();
        }
        return total;
    }
    public double Avg(){
        return total / (double)3;
    }
}
