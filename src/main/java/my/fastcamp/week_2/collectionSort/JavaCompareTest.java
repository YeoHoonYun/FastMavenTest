package my.fastcamp.week_2.collectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class JavaCompareTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<User> users = getCreateUsers();

        System.out.println("===== 정렬 하기전 =====");
        for (User temp : users) {
            System.out.println(temp);
        }

        Collections.sort(users, new NameAscCompare());
        System.out.printf("\n\n===== 문자 오름 차순 정렬 =====\n");
        for (User temp : users) {
            System.out.println(temp);
        }

        Collections.sort(users, new NameDescCompare());
        System.out.printf("\n\n===== 문자 내림 차순 정렬 =====\n");
        for (User temp : users) {
            System.out.println(temp);
        }

        Collections.sort(users, new NoAscCompare());
        System.out.printf("\n\n===== 숫자 오름 차순 정렬 =====\n");
        for (User temp : users) {
            System.out.println(temp);
        }

        Collections.sort(users, new NoDescCompare());
        System.out.printf("\n\n===== 숫자 내림 차순 정렬 =====\n");
        for (User temp : users) {
            System.out.println(temp);
        }
    }


    /**
     * User Data Create
     * @return
     */
    private static List<User> getCreateUsers() {
        // TODO Auto-generated method stub
        List<User> users = new ArrayList<User>();

        User user = new User();
        user.setName("고철수");
        user.setAddress("경기도 성남시 분당구");
        user.setPhone("010-1234-0192");
        user.setNo(1);
        users.add(user);


        user = new User();
        user.setName("박영희");
        user.setAddress("부산 해운대");
        user.setPhone("010-4234-0192");
        user.setNo(2);
        users.add(user);


        user = new User();
        user.setName("감수왕");
        user.setAddress("충북 제천");
        user.setPhone("010-7234-0192");
        user.setNo(3);
        users.add(user);


        user = new User();
        user.setName("이사람");
        user.setAddress("강원도 영울");
        user.setPhone("010-0234-0192");
        user.setNo(4);
        users.add(user);
        return users;
    }
    /**
     * 이름 오름차순
     * @author falbb
     *
     */
    static class NameAscCompare implements Comparator<User> {
        /**
         * 오름차순(ASC)
         */
        @Override
        public int compare(User arg0, User arg1) {
            // TODO Auto-generated method stub
            return arg0.getName().compareTo(arg1.getName());
        }
    }
    /**
     * 이름 내림차순
     * @author falbb
     *
     */
    static class NameDescCompare implements Comparator<User> {
        /**
         * 내림차순(DESC)
         */
        @Override
        public int compare(User arg0, User arg1) {
            // TODO Auto-generated method stub
            return arg1.getName().compareTo(arg0.getName());
        }

    }

    /**
     * No 오름차순
     * @author falbb
     *
     */
    static class NoAscCompare implements Comparator<User> {
        /**
         * 오름차순(ASC)
         */
        @Override
        public int compare(User arg0, User arg1) {
            // TODO Auto-generated method stub
            return arg0.getNo() < arg1.getNo() ? -1 : arg0.getNo() > arg1.getNo() ? 1:0;
        }
    }
    /**
     * No 내림차순
     * @author falbb
     *
     */
    static class NoDescCompare implements Comparator<User> {
        /**
         * 내림차순(DESC)
         */
        @Override
        public int compare(User arg0, User arg1) {
            // TODO Auto-generated method stub
            return arg0.getNo() > arg1.getNo() ? -1 : arg0.getNo() < arg1.getNo() ? 1:0;
        }
    }
}
