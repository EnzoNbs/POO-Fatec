package ex2;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(){
    }

    public Animal(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int idade) {
        this.age = idade;
    }

    @Override
    public String toString() {
        return " Animal {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }

    public abstract String move();
}
