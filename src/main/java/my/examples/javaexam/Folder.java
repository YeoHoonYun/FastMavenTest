package my.examples.javaexam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.lang.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class Folder {
    private String Name;
    private List<File> FileNames;
    private List<Folder> FolderNames;

    public Folder(String Name){
        this.Name = Name;
        FileNames = new ArrayList<>();
        FolderNames = new ArrayList<>();
    }

    public void setName(String name) {
        Name = name;
    }

    public void setFileNames(File fileNames) {
        FileNames.add(fileNames);
    }

    public void setFolderNames(Folder folderNames) {
        FolderNames.add(folderNames);
    }

    public String getName() {
        return Name;
    }

    public Iterator<File> getFileNames() {
        return FileNames.iterator();
    }

    public Iterator<Folder> getFolderNames() {
        return FolderNames.iterator();
    }

    public long getLenth(){
        int total = 0;
        for (File file : this.FileNames){
            total += file.getLength();
        }
        for (Folder folder : this.FolderNames){
            total += folder.getLenth();
        }
        return total;
    }

    public void deleteFolder(String name){
        while(this.FolderNames.iterator().hasNext()){
            if (this.FolderNames.iterator().next().equals(name)){
                this.FolderNames.iterator().remove();
            }
        }
    }
}

// Folder Folder = new Folder();
// 인스턴스 생성부터 필드에 값을 가지게 만드는 방법이 필요하다.
// 생성할 떄 이름값을 넘겨줄 필요가 있다. 생성자를 이용.
// Folder Folder = new Folder("영화")