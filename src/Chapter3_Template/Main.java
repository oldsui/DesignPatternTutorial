package Chapter3_Template;


public class Main {
    public static void main(String[] args) {

        AbstractDisplay d1 = new CharDisplay('F');
        AbstractDisplay d2 = new StringDisplay("This is a message");

        d1.display();
        d2.display();

    }
}
