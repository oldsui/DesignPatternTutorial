package Chapter3_Template;


public class StringDisplay extends AbstractDisplay{

    private String msg;

    private int width;

    public StringDisplay(String str) {
        this.msg = str;
        this.width = str.length();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }


    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("|" + msg + "|");
    }


    public void close() {
        printLine();
    }

}
