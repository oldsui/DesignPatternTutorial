package Chapter4_Factory.idcard;

import Chapter4_Factory.framework.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IDCard extends Product {
    private String owner;

    public void use() {
        System.out.println(owner + " has used his ID card");
    }

}
