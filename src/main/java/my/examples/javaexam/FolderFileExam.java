package my.examples.javaexam;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

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
public class FolderFileExam {
    public static void main(String[] args){
        Folder myworkFolder = new Folder("c:\\mywork\\");
        Folder javaFolder = new Folder("java\\");
        Folder docFolder = new Folder("doc\\");

        myworkFolder.setFolderNames(javaFolder);
        myworkFolder.setFolderNames(docFolder);

        File java1File = new File("java1.txt");
        java1File.setLength(900);
        javaFolder.setFileNames(java1File);
        File java2File = new File("java2.txt");
        java2File.setLength(800);
        javaFolder.setFileNames(java2File);
        File readFile = new File("readme.txt");
        readFile.setLength(700);
        docFolder.setFileNames(readFile);
        File helloFile = new File("hello");
        helloFile.setLength(500);
        myworkFolder.setFileNames(helloFile);

//        System.out.println(myworkFolder.getLenth());
//        System.out.println(javaFolder.getLenth());
//        System.out.println(docFolder.getLenth());

//        myworkFolder.deleteFolder("java");
//        System.out.println(myworkFolder.getLenth());
        myworkFolder.getFolderNames();
//        while(myworkFolder.getFolderNames().hasNext()) {
//            System.out.println(myworkFolder.getFolderNames().next());
//        }


    }
}
