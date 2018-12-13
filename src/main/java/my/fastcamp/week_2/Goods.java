package my.fastcamp.week_2;

import java.util.Objects;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class Goods implements Comparable<Goods>{
    private int id;
    private String name;
    private int price;

    public Goods() {
    }

    // All Argument 생성자
    public Goods(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter, Setter 메소드
    // Alt + Insert
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // id, name, price 값이 같으면 같다고 판단하자.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // this 내 자신 인스턴스를 참조 | static 참조변수는 쓸수 없다.
        // getClass는 입력된 클래스의 정보 - 클래스는 한번만 메모리에 올라간다. - Goods 타입인지 확인
        if (o == null || getClass() != o.getClass()) return false;// | 는 두개중 하나만 참이면 참 - 앞에만 참이면 뒤에는 실행 X

        // 형변환
        Goods goods = (Goods) o;

        //id는 외부에서 아닌 내부에서 동작하는 것이기 때문에 get000 메소드를 구현 하지 않아도됨.
        return id == goods.id &&
                price == goods.price &&
                Objects.equals(name, goods.name);
        // 같은 클래스, 같은 필드가지고 있는지.
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Goods o) {
        return price - o.price;
    }
}
/*
    Goods g1 = new Goods();
    Set<Goods> set = new HashSet<>();
    set.add(g1);
    set.add(g2);
    ...

    add(g1)을 할 때 add()메소드 내부에서는 g1이 가지고 있는 hashCode()라는 메소드를 호출하여 hashCode를 구한다.
    버켓은 리스트형인데, 이곳에 g1을 저장한다.
    add(g2)를 하면 add()메소드에서는 g2의 hashCode를 구한다.
    만약 g2와 g1의 hashCode가 같다면 같은 버켓을 사용한다.
    해당 버켓에서 g2와 같은 값을 가지고 있는 객체가 있는지 순차적으로 equals 메소드로 비교하면서 찾는다.

    * 버켓하나의 버켓 하나가 들어가는 게 제일 베스트
 */
/*
    List에서 원소 2개를 꺼낸다.
    각 원소의 이름을 a, b라고 한다면
    List에서는 다음과 같이 꺼낸다.

    Comparable c = (Comparable)list.get(0);
    Comparable b = (Comparable)list.get(1);

    a.compareTo(b) 로 서로의 값을 비교한다. 그럴려면 compareTo라는 메소드를 가져야 한다.
 */