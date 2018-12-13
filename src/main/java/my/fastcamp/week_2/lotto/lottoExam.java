package my.fastcamp.week_2.lotto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class lottoExam {
    public static void main(String[] args){
        List<lottoBall> lottoBalllist = new ArrayList<>();
        for (int i=1; i<=45;i++){
            lottoBall ball= new lottoBall(i);
            lottoBalllist.add(ball);
        }

        lottoMachine test = new lottoMachine();

        test.setlottBalls(lottoBalllist);

        for (int s : test.getlottoBalls()){
            System.out.print(s + "\t");
        }

    }
}
