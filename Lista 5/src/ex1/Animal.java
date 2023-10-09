package ex1;

public abstract class Animal {
    protected boolean respira;
    protected boolean come;
    public void come(){
        this.come = true;
        System.out.println("Animal comendo");
    }
    public void respira(){
        this.respira = true;
        System.out.println("Animal Respirando");
    }
}
