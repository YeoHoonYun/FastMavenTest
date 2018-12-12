package my.fastcamp.happyjava.ch17;


import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class JavaIO006 {
    public static void main(String[] args) {
        DataInputStream in = null;
        try {
            in = new DataInputStream(new FileInputStream("data2.dat"));

            int i = in.readInt();
            double d = in.readDouble();
            boolean b = in.readBoolean();

            System.out.println(i);
            System.out.println(d);
            System.out.println(b);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception ex) {

            }
        }
    }
}
