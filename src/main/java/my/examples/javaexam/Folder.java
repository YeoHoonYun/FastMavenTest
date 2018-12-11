package my.examples.javaexam;

import sun.awt.FontDescriptor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class Folder {
    private String name; // NULL
    private List<File> files;
    private List<Folder> folders;

    // 기본 생성자는 생성자가 하나 없을 경우에 자동으로 생성된다.
    // 기본 생성자가 아닐 경우엔 사용자가 직접 만들어준다.
    // 생성자는 메소드와 비슷하지만 return 타입이 없고, 클래스명과 이름이 같다.
    // 생성자는 필드를 초기화하는 코드를 가지고 있다.

    public Folder(String name){
        this.name = name;
        files = new ArrayList<>();
        folders = new ArrayList<>();
    }

    public void rename(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public long getLength(){
        long totalLength = 0;

        for (File file : files){
            totalLength += file.getLength();
        }

        for(Folder folder : folders){
            totalLength = totalLength + folder.getLength();
        }

        return totalLength; //TODO length는 계산되야한다.
    }

    public void addFile(File file){
        files.add(file);
    }
    public void deleteFile(String fileName){
        //TODO fileName으로 파일을 지운다.
    }
    //고민거리. 왜 files를 티런하지 않고, files.iterator()를 리턴할까?
    public Iterator<File> fileIterator(){
        return files.iterator(); //모든 파일을 접근하여 꺼낼수가 있음.
    }

    public void addFolder(Folder folder){
        folders.add(folder);
    }
    public void deleteFolder(String folderName){
        //TODO FolderName으로 파일을 지운다.
    }
    public Iterator<Folder> folderIterator(){
        return folders.iterator();
    }

}

// Folder Folder = new Folder();
// 인스턴스 생성부터 필드에 값을 가지게 만드는 방법이 필요하다.
// 생성할 떄 이름값을 넘겨줄 필요가 있다. 생성자를 이용.
// Folder Folder = new Folder("영화")