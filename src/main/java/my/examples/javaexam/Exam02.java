package my.examples.javaexam;

import my.examples.javaexam.car.Bus;
import my.examples.javaexam.car.Car;
import my.examples.javaexam.car.SportsCar;

/**
 * Created by jojoldu@gmail.com on 2018-12-09
 * Github : https://github.com/YeoHoonYun
 */
public class Exam02 {
    public static void main(String[] args){
        Bus bus = new Bus();
        bus.run();
        bus.안내방송();

        Car bus2 = new Bus();
        bus2.run();

        SportsCar s1= new SportsCar();
        s1.run();

        Car s2 = new SportsCar();
        s2.run();
    }
}
