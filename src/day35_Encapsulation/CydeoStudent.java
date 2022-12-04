package day35_Encapsulation;

public class CydeoStudent {


    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public  String fieldsOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent() {

    }


    static {
        schoolName="Cydeo";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber,String fieldsOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldsOfStudy=fieldsOfStudy;
    }

    public static void printSchoolName(){
        System.out.println("School name is "+schoolName);
    }
    public static void printSecretCode(){
        System.out.println("Secret code is "+secretCode);
    }
    public void attendClass(){
        System.out.println(name+"is attending class");
    }
    public void study(){
        System.out.println(name+ " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", schoolname=" + schoolName +
                '}';
    }
}
