package my.fastcamp.happyjava;

import java.io.*;
import java.net.URL;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class chap16 {
    // java oi 데코레이터
    // 주인공과 장식을 구분 해야 한다.
    // 1) 자바 IO는 데코레이터 패턴으로 구성된다. (주인공과 장식을 구분하자.)
    // 2) 표준입력 : System.in(키보드, InputStream),
    //    표준출력 : System.out (모니터, PrintStream),
    //    표준에러출력 : System.err (모니터, PrintStream)
    // 3) 자바 IO는 바이트(byte)입출력과 문자(char)입출력이 있다.
    //    바이트입출력 : 클래스 이름이 Stream으로 끝난다.
    //    -- 입력 : 000InputStream으로 끝난다.
    //    -- 출력 : 000OutputStream으로 끝난다.
    //    문자 입출력 : 클래스 이름이 Reader, Writer로 끝난다.
    //    -- 입력 : 000Reader로 끝난다.
    //    -- 출력 : 000Writer로 끝난다.
    // 4) 자바 IO는 추상클래스인 InputStream, OutputStream, Reader, Writer중에 하나를 상속받는다.
    // 5) 장식에 해당하는 클래스는 생성자에 InputStream, OutputStream, Reader, Writer클래스를 파라미터로 받아들인다.
    // 주인공 : 생성자를 보면 InputStream, OutputStream, Reader, Writer를 받아들이지 않는 클래스
    //추상 클래스 InputStream, OutputStream

    //        InputStream in = null;
    //        OutputStream out = null;
    //        try{
    //            //byte[]로 읽어들여서 파일에 저장하고 싶다.
    //            in = ....;
    //            out= ....;
    //
    //            int readBuffer = -1;
    //            while ((readBuffer = in.read()) != -1) {
    //                out.write(readBuffer);
    //            }
    //        }catch(Exception ex){
    //            .....
    //        }finally{
    //            out.close();
    //            in.close();
    //        }

    public static void main(String[] args) throws Exception {
//        InputStream in = null;
//        OutputStream out = null;
//        try{
//            //byte[]로 읽어들여서 파일에 저장하고 싶다.
//            byte[] buffer = new byte[]{1,2,3};
//            in = new ByteArrayInputStream(buffer);
//            out= new FileOutputStream("bytearray.dat");
//
//            int readBuffer = -1;
//            while ((readBuffer = in.read()) != -1) {
//                out.write(readBuffer);
//            }
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }finally{
//            out.close();
//            in.close();
//        }

//        InputStream in = null;
//        ByteArrayOutputStream out = null;
//        try{
//            //파일로 부터 byte배열을 읽어 들인 후 배열에 저장.
//            in = new FileInputStream("bytearray.dat");
//            out = new ByteArrayOutputStream();
//            int readBuffer = -1;
//            while((readBuffer = in.read()) != -1){
//                out.write(readBuffer);
//            }
//            byte[] buf = out.toByteArray();
//            for(int i = 0; i< buf.length; i++){
//                System.out.println(buf[i]);
//            }
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }finally{
//            out.close();
//            in.close();
//        }

        //byte[]로 읽어들여 byte[]로 쓴다.
        InputStream in = null;
        OutputStream out = null;

        try{
            // URL 읽어 들이기
            URL nrl = new URL("https://www.naver.com/");
            in = nrl.openStream();
//            in = new FileInputStream("C:\\Users\\cjswo\\Downloads\\Resume_ENG.doc");
            out = new FileOutputStream("file.txt");

            int readCount = 0;
            byte[] buffer = new byte[1024];

            while((readCount = in.read(buffer)) != -1){
                out.write(buffer,0,readCount);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            in.close();
            out.close();
        }
    }
    // FIleInputStream, FileOutputStream을 이용하여 파일을 복사하는 클래슽
    //byte --> byte 쓰는것
    //byte[] ---> byte[] 쓰는 것
    //위의 2가지 예제를 만드는데, 복사한 시간을 출력해보는 예제를 만들어 보기
}
