package day34_GarbageCollection_AccessModifiers;

public class CydeoStudentObjects {
    static class CydeoStudentObject{
        public static void main(String[] args) {

            CydeoStudent student1= new CydeoStudent("Jimmy");
            CydeoStudent student2= new CydeoStudent("Kathy");

            System.out.println(student1.schoolName);
            System.out.println(student2.schoolName);

        }
    }
}
