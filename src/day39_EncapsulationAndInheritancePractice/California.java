package day39_EncapsulationAndInheritancePractice;

public class California extends States{
    public California( String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super("California", abbreviation, politicalParty, governor, senator, population, stateTax);
    }
}
