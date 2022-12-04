package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setInfo("Aygun",'F',39,2210,'A');

        Student student2=new Student();
        student2.setInfo("Hulya",'F',39,2334,'B');

        Student student3=new Student();
        student3.setInfo("Elminur",'M',28,5511,'A');

        Student student4=new Student();
        student4.setInfo("Ali",'M',28,2215,'A');

        Student student5=new Student();
        student5.setInfo("Mert",'M',26,2252,'C');

        Student [] students= {student1,student2,student3,student4,student5};

        for (Student student : students) {

            System.out.println(student);
        }

        System.out.println("---------------------------------");
/*
        ArrayList<Student>earlyBirds=new ArrayList<>();//grade:A
        earlyBirds.addAll(Arrays.asList(students));
        earlyBirds.removeIf(p->p.grade!='A');
        System.out.println(earlyBirds);

        ArrayList<Student>angryBirds=new ArrayList<>();
        angryBirds.addAll(Arrays.asList(students));
        angryBirds.removeIf(p->p.grade=='A');
        System.out.println(angryBirds);

 */
        ArrayList<Student>earlyBirds=new ArrayList<>();//grade:A
        ArrayList<Student>angryBirds=new ArrayList<>();//grade:another than A
        for (Student student : students) {
            if(student.grade=='A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }

        }














    }
}
