package my.examples.repeart.Cal181211.folderExam;

import java.util.Iterator;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */

//새로운 폴더를 만든다.
/*
c:\mywork\java\java1.txt  (900)
c:\mywork\java\java2.txt  (800)
c:\mywork\doc\readme.txt  (700)
c:\mywork\hello   (500)
 */
public class FolderFileExam01 {
    public static void main(String[] args) {
        // 폴더를 생성한다.
        Folder myworkFolder = new Folder("c:\\mywork");
        Folder javaFolder = new Folder("java");
        Folder docFolder = new Folder("doc");

        myworkFolder.setFolders(javaFolder);
        myworkFolder.setFolders(docFolder);

        // 파일을 생성
        File java1File = new File("java1.txt");
        java1File.setLength(900);
        javaFolder.setFiles(java1File);

        File java2File = new File("java2.txt");
        java2File.setLength(800);
        javaFolder.setFiles(java2File);

        File readmeFile = new File("readme.txt");
        readmeFile.setLength(800);
        docFolder.setFiles(readmeFile);

        File helloFile = new File("hello");
        helloFile.setLength(500);
        myworkFolder.setFiles(helloFile);

//        // 각 폴더의 길이
//        System.out.println(myworkFolder.getLength());
//        System.out.println(javaFolder.getLength());
//        System.out.println(docFolder.getLength());
//
//        //각 파일 삭제
//        javaFolder.deleteFile("java2.txt");
//        //myworkFolder.deleteFolder("java");
//
//        System.out.println(myworkFolder.getLength());
//        System.out.println(javaFolder.getLength());
//        System.out.println(docFolder.getLength());
        Iterator<Folder> iter = myworkFolder.getFolders();
        while(iter.hasNext()){
            System.out.println(iter.next().getName()+"***");
            iter.remove();
        }

        List<Folder> iter2 = myworkFolder.getFolders2();
        for(int i=0;i<iter2.size();i++){
            System.out.println(iter2.get(i).getName());
            iter2.remove(i);
        }
    }
}
