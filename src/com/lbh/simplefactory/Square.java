package com.lbh.simplefactory;

/**
 * Created by Advancer on 2018/2/5 16:01.
 * auth: lbh
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("通过普通工厂模式画方形");
    }

    @Override
    public void erase() {
        System.out.println("通过普通工厂模式擦除方形");
    }
}
