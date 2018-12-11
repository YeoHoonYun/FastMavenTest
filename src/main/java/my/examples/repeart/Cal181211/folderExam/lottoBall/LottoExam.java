package my.examples.repeart.Cal181211.folderExam.lottoBall;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class LottoExam {
    public static void main(String[] args) {
        List<LottoBall> balls = new ArrayList<>();
        List<LottoBall> reballs = new ArrayList<>();

        koreafactory koreafactory = new koreafactory();
        balls = koreafactory.createLottoBalls();

        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.mix(balls);

        reballs = lottoMachine.results();
        for(LottoBall lb : reballs){
            System.out.println(lb.getNumber());
        }

    }
}
