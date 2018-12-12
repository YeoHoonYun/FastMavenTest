package my.fastcamp.happyjava.ch18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class ObjectOutputTest {
    public static void main(String[] args) {
        //생성자에 Reader나 Writer, inputStream, OutputStream
        ObjectOutputStream oos = null;
        try{
            //ArrayList 자체도 객체 직렬화를 한다.
            List<User> userLIst = new ArrayList<>();

            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            User user = new User();
            user.setName("홍길동");
            user.setId("hong");
            user.setPasswd("1234");
            user.setAge(50);
            userLIst.add(user);

            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            User user2 = new User();
            user2.setName("홍길동");
            user2.setId("hong");
            user2.setPasswd("1234");
            user2.setAge(50);
            userLIst.add(user2);
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            User user3 = new User();
            user3.setName("홍길동");
            user3.setId("hong");
            user3.setPasswd("1234");
            user3.setAge(50);
            userLIst.add(user3);

            oos.writeObject(userLIst);


        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
