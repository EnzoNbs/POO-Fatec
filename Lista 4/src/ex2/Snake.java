package ex2;

public class Snake extends Animal {
    private boolean poisonous;
    private boolean smoke;

    public Snake() {
        super();
    }

    public Snake(String name, int age, boolean poisonous, boolean smoke) {
        super(name, age);
        setPoisonous(poisonous);
        setSmoke(smoke);
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }

    @Override
    public String toString() {
        return "Cobra {" +
                "is poisonous? = " + poisonous +
                ", smokes? = " + smoke +
                '}' + super.toString();
    }

    @Override
    public String move(){
        return "Crawl";
    }
}
