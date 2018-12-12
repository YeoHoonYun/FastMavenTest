package my.fastcamp.happyjava.ch18;

import java.io.File;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class FileTest {
    public static void main(String[] args) {
        File f = new File("." + File.separator + "object.dat");
        if(f.exists()){
            System.out.println("있다.");
        }else{
            System.out.println("없다.");
        }

        System.out.println(File.separator);

        File f2 = new File(".");
        f2.listFiles();
        File[] listFiles = f2.listFiles();
        for(File i : listFiles){
            if(i.isDirectory()){
                System.out.println("[Dir]" + i.getName());
            }
            System.out.println(i.getName());
        }
    }
}
