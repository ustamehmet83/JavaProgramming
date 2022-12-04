package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 4 testers object
        Tester tester1 = new Tester("Mehmet", 11, "QA", 110000);
        Tester tester2 = new Tester("Ahmet", 12, "SDET", 110000);
        Tester tester3 = new Tester("Mustafa", 13, "SE", 120000);
        Tester tester4 = new Tester("Lala", 23, "SDET", 120000);

        Tester[] testers = {tester2, tester3, tester4};

        //4 developers

        Developer developer1 = new Developer("Olga", 25, "Java Developer", 125000);
        Developer developer2 = new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4 = new Developer("Sinem", 22, "Senior Developer", 125000);

        Developer[] developers = {developer2, developer3, developer4};

        //1 ScrumTeam Object

        ScrumTeam scrum = new ScrumTeam("Talha", "Cevahir", "Kadir", 15);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name);
        }


        System.out.println("----------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);

        }

        System.out.println("----------------------------");
        scrum.removeTester(23);
        scrum.removeDeveloper(22);

        System.out.println(scrum);


    }
}
