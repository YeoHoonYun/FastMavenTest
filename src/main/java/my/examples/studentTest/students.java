package my.examples.studentTest;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class students {
    private String name;
    private double enScore;
    private double gukScore;
    private double maScore;

    void setName(String name){
        this.name = name;
    }
    void setEnScore(int enScore){
        this.enScore = enScore;
    }
    void setGukScore(int gukScore){
        this.gukScore = gukScore;
    }
    void setMaScore(int maScore){
        this.maScore = maScore;
    }
    String getName(){
        return name;
    }
    double getEnScore(){
        return enScore;
    }
    double getGukScore(){
        return gukScore;
    }
    double getMaScore(){
        return maScore;
    }
    double getTotalScore(){
        return this.maScore + this.gukScore + this.enScore;
    }
    double getAvgScore(){
        return (this.maScore + this.gukScore + this.enScore)/3;
    }
}
