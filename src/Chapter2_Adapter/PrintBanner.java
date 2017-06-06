package Chapter2_Adapter;

/*

    This is the adapter class
    extends adaptee (Banner)
    implements target (Print), used by client/user
 */

public class PrintBanner extends Banner implements Print{

    public PrintBanner(String msg) {
        super(msg);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithArister();
    }

}
