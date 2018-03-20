package cn.fruitd.factory;

public class BProduct extends AbstractProduct {
    public BProduct(){
        System.out.println("B product is created by product");
    }

    @Override
    public void use() {
        System.out.println("B product is using");
    }
}
