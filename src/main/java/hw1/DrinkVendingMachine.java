package hw1;

import java.util.List;

public class DrinkVendingMachine implements VendingMachine {
    private final List<Product> productList;

    public DrinkVendingMachine(List<Product> productList) {
        this.productList = productList;
    }


    public Product getProduct(String name) {
        for (Product products : productList) {
            if (products.getName().equalsIgnoreCase(name)) {
                return products;
            }

        }
        throw new IllegalStateException(String.format("The product with name %s not found. ", name));
    }

    @Override
    public void initProduct() {



    }@Override
    public String getProduct(){
        return null;
    }

}
