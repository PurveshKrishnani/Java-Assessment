package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Espncricinfo {


    static final int size = 50;
    List<Batsman> batsmans = new ArrayList<>();
    int noOfBatsmen;

    public Espncricinfo(List<Batsman> batsmans, int noOfBatsmen) {
        this.batsmans = batsmans;
        this.noOfBatsmen = noOfBatsmen;
    }

    public Espncricinfo() {
        this.noOfBatsmen = noOfBatsmen;
        this.batsmans = batsmans;
    }


    public void getBatsmans() {
       for (Batsman batter : batsmans)
       {
           System.out.println(batter);
       }
    }


    public int getNoOfBatsmen() {
        return batsmans.size();
    }

    public Optional<Batsman> updateBatsmanStats(int id, int centuries, int halfCenturies) {
        for (Batsman batsman : batsmans) {
            if (batsman.getId() == id) {
                batsman.setCenturies(centuries);
                batsman.setHalfCenturies(halfCenturies);
                return Optional.of(batsman);
            }
        }
        return Optional.empty();
    }

    public Optional<Batsman> addBatsman(Batsman batsman) {
        if ( batsmans.size()   < size) {
            batsmans.add(batsman);
            return Optional.of(batsman);
        }
        return Optional.empty();
    }

    public Optional<Batsman> getBatsman(int id) {
        for (Batsman batsman : batsmans) {
            if (batsman.getId() == id) {
                return Optional.of(batsman);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        {
            Espncricinfo espncricinfo = new Espncricinfo();
            Batsman batone = new Batsman("purvesh", 10000, 20, 30);
            Batsman battwo = new Batsman("purvesh", 20000, 20, 30);
            Batsman batthree = new Batsman("purvesh", 30000, 20, 30);
            Batsman batfour = new Batsman("purvesh", 40000, 20, 30);


            espncricinfo.addBatsman(batone);
            espncricinfo.addBatsman(battwo);
            espncricinfo.addBatsman(batthree);
            espncricinfo.addBatsman(batfour);

            espncricinfo.getBatsmans();

            System.out.println("");
            espncricinfo.updateBatsmanStats(1000,40,90);
            espncricinfo.getBatsmans();
            System.out.println("");

            System.out.println("No  of batsman in array  is " + espncricinfo.getNoOfBatsmen());


            System.out.println(espncricinfo.getBatsman(100001));


        }
    }
}
