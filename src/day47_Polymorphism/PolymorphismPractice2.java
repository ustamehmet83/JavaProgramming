package day47_Polymorphism;

import day43_AbstractionIntro.employeeTask.Developer;
import day43_AbstractionIntro.employeeTask.Employee;
import day43_AbstractionIntro.employeeTask.Tester;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice2 {

    public static void main(String[] args) {
        Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        };
        List<Employee> scrumMembers = new ArrayList<>();

        for (Employee each:employees) {
            if ((each instanceof Tester|| each instanceof Developer)){
                scrumMembers.add(each);
            }
        }
        System.out.println("scrumMembers = " + scrumMembers);

        System.out.println("------------------------------------------------");

        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();
        for (Employee each:employees) {
            if (each instanceof Tester){
                testers.add((Tester) each);
            }
            if (each instanceof Developer){
                developers.add((Developer)each);
            }
        }
        System.out.println("testers = " + testers);

        System.out.println("developers = " + developers);

        System.out.println("------------------------------------------------");

        Tester testerWithMaxSalary=testers.get(0);

        for (Tester each:testers) {
            if (each.getSalary()>testerWithMaxSalary.getSalary()){
                testerWithMaxSalary=each;
            }
        }
        System.out.println("testerMaxSalary = " + testerWithMaxSalary);

      Developer developerWithMaxSalary= developers.get(0);

        for (Developer each:developers) {
          if(each.getSalary()>developerWithMaxSalary.getSalary()) {
              developerWithMaxSalary=each;
          }
        }
        System.out.println("developerSalary = " + developerWithMaxSalary);


















    }






}
