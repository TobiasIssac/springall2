package org.example.proxy5;

public class ProductServiceImp implements Service {
    @Override
    public void buy() {
        System.out.println("商品购买成功。。。。。");
    }

    @Override
    public String show(int age) {
        System.out.println("很妙啊"+age);
        return "确实少女";
    }
}
