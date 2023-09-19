package ex2;

public class Teste {
    public static void showDetails(Animal animal){
        System.out.println(animal.toString());
        System.out.println("move = " + animal.move());
    }

    public static void main(String[] args) {
        Snake objSnake = new Snake("Python", 2, true, true);
        showDetails(objSnake);

        Horse objHorse = new Horse("Plotka", 6, true);
        showDetails(objHorse);
    }
}
