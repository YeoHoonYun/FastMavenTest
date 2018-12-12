package my.examples.repeart.Cal181211.folderExam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> folders;

    public Folder(String name){
        this.name = name;
        files = new ArrayList<>();
        folders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(File files) {
        this.files.add(files);
    }

    public Iterator<Folder> getFolders() {
        return folders.iterator();
    }
    public List<Folder> getFolders2() {
        return folders;
    }

    public void setFolders(Folder folders) {
        this.folders.add(folders);
    }

    public int getLength(){
        int total = 0;
        for(int i = 0; i < files.size(); i++){
            total += files.get(i).getLength();
        }
        for(int i = 0; i < folders.size(); i++){
            total += folders.get(i).getLength();
        }
        return total;
    }

    public void deleteFolder(String name){
        Iterator<Folder> iterator = folders.iterator();
        while(iterator.hasNext()){
            Folder file = iterator.next();
            if(file.getName().equals(name)){
                iterator.remove();
                break;
            }
        }
    }
    public void deleteFile(String name){
        Iterator<File> iterator = files.iterator();
        while(iterator.hasNext()){
            File file = iterator.next();
            if(file.getName().equals(name)){
                iterator.remove();
                break;
            }
        }
    }
}
