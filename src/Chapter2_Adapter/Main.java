package Chapter2_Adapter;


public class Main {


    public static void main(String[] args) {
        Print pb = new PrintBanner("This is a message");

        pb.printWeak();

        pb.printStrong();
    }

}
