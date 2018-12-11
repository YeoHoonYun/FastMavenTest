package my.examples.repeart.Cal181211.folderExam.lottoBall;

import java.util.*;
/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class LottoMachine {
    private List<LottoBall> Balls;
    private List<LottoBall> reBalls;
    public LottoMachine(){
        Balls = new ArrayList<>();
        reBalls = new ArrayList<>();
    }
    public void mix(List<LottoBall> balls){
        this.Balls = balls;
        Collections.shuffle(Balls);
    }

    public List<LottoBall> results(){
        for(int i=0;i<6;i++){
            reBalls.add(Balls.get(i));
        }
        return reBalls;
    }
}
