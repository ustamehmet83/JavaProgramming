package day36_OOPInheritanceIntro.encapculation;

public class Student {
    private String name;
    private int age;
    private char gender,grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }
    public char getGrade() {
        return grade;
    }
    public String getSchoolName() {
        return schoolName;
    }


    public void setName(String name) {
        if (name.isBlank()|| name.isEmpty()){
            System.out.println("Invalid name :"+ name);
            System.exit(0);
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age<5 || age>90){
            System.out.println("Invalid age :"+age);
            System.exit(0);
        }
        this.age = age;
    }

    public void setGender(char gender) {
       gender=( ""+gender).toUpperCase().charAt(0);
       if(!(gender == 'M' || gender == 'F')){
           System.out.println("Invalid gender :"+gender);
           System.exit(0);
       }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        grade=( ""+grade).toUpperCase().charAt(0);
        if(!(grade== 'A' || grade == 'B'|| grade == 'C'|| grade == 'D'|| grade == 'F')){
            System.out.println("Invalid grade :"+grade);
            System.exit(0);
        }
        this.grade = grade;
    }
    public void setSchoolName(String schoolName) {
        if (schoolName.isBlank()|| schoolName.isEmpty()){
            System.out.println("Invalid school name :"+ schoolName);
            System.exit(0);
        }
        this.schoolName = schoolName;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
