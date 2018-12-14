package my.examples.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-14
 * Github : https://github.com/YeoHoonYun
 */
public class TcpClientTest {
    public static void main(String[] args) {
        try{
            String serverIP = "127.0.0.1";
            System.out.println("서버에 연결중입니다. 서버 IP : " + serverIP);

            Socket socket = new Socket(serverIP, 5000);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("서버로부터 받은 메세지 : " + dis.readUTF());
            System.out.println("연결을 종료합니다.");

            dis.close();
            socket.close();
        }catch (ConnectException ce){
            ce.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }// try = catch
    }// main
}// TcpClientTest
/*
 * 결과
 * 서버에 연결중입니다. 서버IP : 1270.0.0.1
 * 서버로부터 받은 메세지 : 서버로부터의 메세지입니다.
 * 연결을 종료합니다.
 */