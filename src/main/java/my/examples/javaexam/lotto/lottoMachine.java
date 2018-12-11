package my.examples.javaexam.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class lottoMachine {
    private List<lottoBall> lottoBalllist;
    private List<Integer> lottoResult;

    public lottoMachine(){
        lottoResult = new ArrayList<>();
    }
    public void setlottBalls(List<lottoBall> balls){
        lottoBalllist = balls;
        Collections.shuffle(lottoBalllist);

    }
    public List<Integer> getlottoBalls(){
        for (int i=0; i<6;i++){
            lottoResult.add(lottoBalllist.get(i).getNubmer());
        }
        return lottoResult;
    }

}
