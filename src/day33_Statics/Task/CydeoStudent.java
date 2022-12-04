package day33_Statics.Task;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public String batchNumber;
    public int groupNumber;

    public static String schoolName="schoolName";
    public static String progLanguage="programmingLanguage";

    public CydeoStudent(String name, int age, char gender, int id, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+" is studying");
    }
    public void attendClass(){
        System.out.println(name+" is attending class");
    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printProgLanguages(){
        System.out.println(progLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
