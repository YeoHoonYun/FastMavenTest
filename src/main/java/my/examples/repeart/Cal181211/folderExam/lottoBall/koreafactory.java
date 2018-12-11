package my.examples.repeart.Cal181211.folderExam.lottoBall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class koreafactory implements ballFactory {
    List<LottoBall> balls = new ArrayList<>();
    public List<LottoBall> createLottoBalls(){
        for(int i=1;i<=45;i++){
            LottoBall lottoBall = new LottoBall(i);
            balls.add(lottoBall);
        }
        return balls;
    }

}
