package my.fastcamp.happyjava.ch17;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class JavaIO004 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try{
            //br, pw을 초기화하는 코드
            // 한줄씩 입력받아서 한 줄 씩 쓴다.
            //키보드로부터 입력받도록 br을 초기화
            //파일에 쓰도록 pw를 초기화.
            InputStreamReader isr = new InputStreamReader(System.in);
            //BufferedReader에는 Reader 형식이 들어와야함.
            br = new BufferedReader(isr);
            FileWriter fw = new FileWriter("keyboard.txt");
            pw = new PrintWriter(fw);
            String line = null;
            int num = 1;
            while((line = br.readLine()) != null){
                pw.println(num + " : " + line);
                num++;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try {
                br.close();
            }catch(Exception ex){}
            try {
                pw.close();
            }catch(Exception ex){}
        }
    }
}
