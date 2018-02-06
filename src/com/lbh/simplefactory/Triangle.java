package com.lbh.simplefactory;

/**
 * Created by Advancer on 2018/2/5 16:03.
 * auth: lbh
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("通过普通工厂模式画三角形");
    }

    @Override
    public void erase() {
        System.out.println("通过普通工厂模式擦除三角形");
    }
}
