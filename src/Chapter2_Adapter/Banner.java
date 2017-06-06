package Chapter2_Adapter;

import lombok.AllArgsConstructor;
import lombok.Data;


/*
    Adaptee, to be adapted,
    cannot be used directly or it's existing tested code, which we don't want to modify
 */

@AllArgsConstructor
@Data
public class Banner {

    private String msg;

    public void showWithParen() {
        System.out.println("(" + msg + ")");
    }

    public void showWithArister() {
        System.out.println("*" + msg + "*");
    }
}

