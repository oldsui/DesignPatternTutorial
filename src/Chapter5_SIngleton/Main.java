package Chapter5_SIngleton;


public class Main {
    public static void main(String[] args) {

        UniqueClass obj1 = UniqueClass.getInstance();
        UniqueClass obj2 = UniqueClass.getInstance();

        if (obj1 == obj2) {
            System.out.println("All instances are the same one");
        } else {
            System.out.println("Bug in your singleton");
        }

    }

}
