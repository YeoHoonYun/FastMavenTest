package my.examples.javaexam;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class File {
    private String name;
    private long length;

    public File(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public long getLength() {
        return length;
    }
}
