package my.fastcamp.week_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-14
 * Github : https://github.com/YeoHoonYun
 */
class Car implements Comparable<Car> {
    private String modelName;
    private int modelYear;
    private String color;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Car(String mm, int my, String c){
        this.modelName = mm;
        this.modelYear = my;
        this.color = c;
    }

    public String getModel(){
        return this.modelYear + "식" + this.modelName + " " + this.color;
    }

    @Override
    public int compareTo(Car o) {
        return modelYear - o.modelYear;
    }
}

public class Comparable01 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Car car01 = new Car("a아반떼", 2016, "노란색");
        carList.add(car01);
        Car car02 = new Car("b소나타", 2010, "흰색");
        carList.add(car02);
        Collections.sort(carList);
        for (Car i : carList){
            System.out.println(i.getModelName());
        }
        Collections.sort(carList, new ComparatorExam());
        for (Car i : carList){
            System.out.println(i.getModelName());
        }
    }
}

class ComparatorExam implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModelName().compareTo(o2.getModelName());
    }
}