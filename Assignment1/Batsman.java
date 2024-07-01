package Assignment1;

public class Batsman {

    private  int  Id;
    public String name;
    public  int  runsScored;
    public int  centuries;
    public int  halfCenturies;
    private  static  int  idGenerator = 100000;


    public Batsman() {
        Id = idGenerator++;
        this.name = name;
        this.runsScored = runsScored;
        this.centuries = centuries;
        this.halfCenturies = halfCenturies;
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", runsScored=" + runsScored +
                ", centuries=" + centuries +
                ", halfCenturies=" + halfCenturies +
                '}';
    }


    public Batsman( String name, Integer runsScored, Integer centuries, Integer halfCenturies) {
        this.Id= idGenerator++;
        this.name = name;
        this.runsScored = runsScored;
        this.centuries = centuries;
        this.halfCenturies = halfCenturies;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRunsScored(Integer runsScored) {
        this.runsScored = runsScored;
    }

    public void setCenturies(Integer centuries) {
        this.centuries = centuries;
    }

    public void setHalfCenturies(Integer halfCenturies) {
        this.halfCenturies = halfCenturies;
    }



    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Integer getRunsScored() {
        return runsScored;
    }

    public Integer getCenturies() {
        return centuries;
    }

    public Integer getHalfCenturies() {
        return halfCenturies;
    }


}
