package Chapter4_Factory.idcard;

import Chapter4_Factory.framework.*;

import java.util.*;

import lombok.*;

@Data
public class IDCardFactory extends Factory{

    private List<String> owners = new ArrayList();

    protected Product createProduct(String owner) {
        System.out.println("Created: " + owner);
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        String owner = ((IDCard)product).getOwner();
        owners.add(owner);
        System.out.println("Registered: " + owner);
    }
}
