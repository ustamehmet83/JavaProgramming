package day31_Constructors;

import day31_Constructors.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setInfo("Virginia","Amazon INC","SDET",110000,true, true,true,true);

        Offer offer2=new Offer();
        offer2.setInfo("California","Sony INC","QA",120000,true, false,false,false);

        Offer offer3=new Offer();
        offer3.setInfo("Florida","Apple INC","QE",125000,true, true,false,true);

        Offer offer4=new Offer();
        offer4.setInfo("Texas","CapitalOne","SM",115000,false, false,true,true);

        Offer offer5=new Offer();
        offer5.setInfo("Dallas","BOA","BA",130000,true, false,false,false);

        Offer offer6=new Offer();
        offer6.setInfo("Washington","BOA","BA",130000,true, false,true,true);

        Offer offer7=new Offer();
        offer7.setInfo("Dallas","Facebook","QA",130000,true, false,false,false);

        System.out.println(offer1);
        System.out.println(offer2);

        System.out.println("-------------------------------------------------------");

        Offer[] myOffers={offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer>offerList=new ArrayList<>(Arrays.asList(myOffers));

        ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p-> p.isFullTime==false);

        System.out.println(fullTimeOffers); // removes if the offer is NOT full time

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer>localOffer=new ArrayList<>(Arrays.asList(myOffers));

        localOffer.removeIf(p-> !p.location.equals("Virginia"));
        System.out.println(localOffer.size());
        
        




    }
}
