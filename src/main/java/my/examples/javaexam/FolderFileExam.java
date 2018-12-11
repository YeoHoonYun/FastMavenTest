package my.examples.javaexam;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class FolderFileExam {
    public static void main(String[] args){
        String basePath = "C:\\mywork\\";

        Folder mywork = new Folder(basePath);

        Folder javaFolder = new Folder(basePath+"java\\");
        Folder docFolder = new Folder(basePath+"doc\\");

        mywork.addFolder(javaFolder);
        mywork.addFolder(docFolder);

        File java1File = new File("java1.txt");
        java1File.setLength(900);
        javaFolder.addFile(java1File);

        File java2File = new File("java2.txt");
        java2File.setLength(800);
        javaFolder.addFile(java2File);

        File readeFile = new File("readme.txt");
        readeFile.setLength(700);
        docFolder.addFile(readeFile);

        File helloFile = new File("hello");
        helloFile.setLength(500);
        mywork.addFile(helloFile);

        System.out.println(mywork.getLength());
        System.out.println(javaFolder.getLength());
        System.out.println(docFolder.getLength());

    }
}
