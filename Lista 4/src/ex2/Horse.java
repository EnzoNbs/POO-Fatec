package ex2;

public class Horse extends Animal {
    private boolean competitor;

    public Horse(){
        super();
    }

    public Horse(String name, int age, boolean competitor) {
        super(name, age);
        setCompetitor(competitor);
    }

    public boolean isCompetitor() {
        return competitor;
    }

    public void setCompetitor(boolean competitor) {
        this.competitor = competitor;
    }

    @Override
    public String toString() {
        return "Horse {" +
                "competitor = " + competitor +
                "}" + super.toString();
    }

    @Override
    public String move(){
        return "Trots";
    }
}
