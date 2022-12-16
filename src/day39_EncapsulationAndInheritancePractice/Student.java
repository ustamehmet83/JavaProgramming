package day39_EncapsulationAndInheritancePractice;

public class Student extends Person{
    private int studentId;
    private String fieldOfStudy;
    public Student(String name, int age, char gender,int studentId,String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setStudentId(int studentId) {
        if(studentId<=0){
            System.out.println("invalid student id");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy.isEmpty()||fieldOfStudy.isBlank()){
            System.out.println("invalid field of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + getName() +'\'' +
                "age=" + getAge() +'\'' +
                "gender=" + getGender() +'\'' +
                "studentId=" + studentId +'\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
