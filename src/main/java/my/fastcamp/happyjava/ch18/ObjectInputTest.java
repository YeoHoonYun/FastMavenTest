package my.fastcamp.happyjava.ch18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class ObjectInputTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try{
            File f = new File("object.dat");
            if(!f.exists()){
                System.out.println("object.dat 파일이 없어요.");
                //System.exit(0); 자바어플리케이션에서는 사용가능하지만
                // 웹프로그래밍 같은 거 할때는 적으면 안된다.
                return;
            }

            ois = new ObjectInputStream(new FileInputStream("object.dat"));
            //Object obj = ois.readObject();
            //User user = (User)obj;
            //User user = (User)ois.readObject();

            List<User> list = (ArrayList)ois.readObject();
            for (User user : list) {
                System.out.println(user.getName());
                System.out.println(user.getId());
                System.out.println(user.getPasswd());
                System.out.println(user.getAge());
            }


        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            try{
                ois.close();
            }catch (Exception ex){

            }
        }
        //String dir = "디텍토리 이름";
        //코드를 작성.
        //dir변수에 지정한 디렉토리와 그 디렉토리 이하에 있는 모든 파일들의 목록을 출력
    }
}
