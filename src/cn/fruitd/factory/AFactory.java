package cn.fruitd.factory;

public class AFactory implements AbstractFactory  {
    @Override
    public AbstractProduct create() {
        return new AProduct();
    }
}
