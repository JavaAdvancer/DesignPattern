package com.lbh.simplefactory;

/**
 * Created by Advancer on 2018/2/5 15:59.
 * auth: lbh
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("通过普通工厂模式画圆");
    }

    @Override
    public void erase() {
        System.out.println("通过普通工厂模式擦除圆");
    }
}
