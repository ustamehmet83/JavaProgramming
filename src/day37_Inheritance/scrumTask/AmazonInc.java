package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String company="AmazonINC";
        ProductOwner po= new ProductOwner("Suhaib",company,1,160000,29,'M');

        BusinessAnalyst ba= new BusinessAnalyst("Cihad",company,2,150000,30,'M');

        ScrumMaster sm=new ScrumMaster("Anel",company,3,145000,35,'M');

        Tester tester1=new Tester("Chinara","QA",company,1415,125000,32,'F');
        Tester tester2=new Tester("Yasaman","QE",company,1416,130000,31,'F');
        Tester tester3=new Tester("Irena","SDET",company,1417,128000,29,'F');
        Tester tester4=new Tester("Cihad","QA",company,1418,125000,26,'M');
        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1= new Developer("Daniela","Java Developer",company,8,135000,27,'F');

        ScrumTeam scrumTeam=new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);


        System.out.println("----------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+" : "+tester.salary);
        }

        System.out.println("-----------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+" : "+developer.salary);

        }








    }
}
