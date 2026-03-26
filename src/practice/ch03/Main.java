package practice.ch03;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        // CharDisplay d1 = new CharDisplay('H');
        d1.display();
        d1.open();

        System.out.println();

        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        // StringDisplay d2 = new StringDisplay("Hello, world.");
        d2.display();
    }
}
