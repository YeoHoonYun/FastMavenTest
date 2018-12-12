package my.fastcamp.happyjava.ch17;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class JavaIO005 {
    //DataOutputStream
    //정수를 저장하다.
    //실수를 저장하다.
    //boolean 저장하다.
    //FileOutputStream
    public static void main(String[] args) {
        DataOutputStream out = null;
        try {
            int i = 5;//4byte
            double d = 20.5; //8byte
            boolean b = true; // 1byte

            FileOutputStream fos = new FileOutputStream("data2.dat");
            out = new DataOutputStream(fos);

            out.writeInt(i);
            out.writeDouble(d);
            out.writeBoolean(b);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (Exception ex) {

            }
        }
        //파일을 한줄씩 읽어들여서 다른파일로 한줄씩 쓰는
        //라인수가 출력된다.
        // 만약 전체 라인수가 200줄일 경우
        // 001 : 읽어들인줄
        // 002 : 읽어들인줄

        // 만약 전체 라인수가 1000줄일 경우
        // 0001 : 읽어들인줄
    }
}
