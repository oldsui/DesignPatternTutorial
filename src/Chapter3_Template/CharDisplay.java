package Chapter3_Template;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CharDisplay extends AbstractDisplay {
    private char ch;

    public void open() {
        System.out.print("<<");
    }

    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.println(">>");
    }

}
