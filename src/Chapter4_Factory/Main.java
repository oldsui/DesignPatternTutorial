package Chapter4_Factory;

import Chapter4_Factory.framework.*;
import Chapter4_Factory.idcard.*;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("John");
        Product card2 = factory.create("Nidalee");

        card1.use();
        card2.use();

    }
}
