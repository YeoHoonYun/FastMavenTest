package my.fastcamp.week_2.student;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-12
 * Github : https://github.com/YeoHoonYun
 */
public class StudentExam {
    public static void main(String[] args){
        StudentUI studentUI = new StudentUI();
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("yun");
        Student student2 = new Student(new String("yun"));
        Student student3 = new Student("yun");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.getName() == student2.getName());
        System.out.println(student1.getName() == student3.getName());
        System.out.println(student1.getName().equals(student2.getName()));

//        while(true){
//            Students student = studentUI.inputStudent();
//            studentManager.addStudent(student);
//            String result = studentUI.inputContinue();
//            if("Y".equals(result.toUpperCase())){
//                continue;
//            }else{
//                break;
//            }
//        }

//        Iterator<Students> iterator =
//                studentManager.iterator();
//        while(iterator.hasNext()){
//            Students student = iterator.next();
//            System.out.print(student.getName());
//            System.out.print("\t");
//            System.out.print(student.getKor());
//            System.out.print("\t");
//            System.out.print(student.getEng());
//            System.out.print("\t");
//            System.out.println(student.getMath());
//        }
        Student student = new Student("kim", 90,90,90);
        studentManager.addStudent(student);

        student.setMath(500);

        System.out.print(studentManager.getKorTotal());
        System.out.print("\t");
        System.out.print(studentManager.getEngTotal());
        System.out.print("\t");
        System.out.println(studentManager.getMathTotal());

        System.out.print(studentManager.getKorAvg());
        System.out.print("\t");
        System.out.print(studentManager.getEngAvg());
        System.out.print("\t");
        System.out.println(studentManager.getMathAvg());
    }
}
