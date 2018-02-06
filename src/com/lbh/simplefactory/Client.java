package com.lbh.simplefactory;

/**
 * Created by Advancer on 2018/2/5 16:17.
 * auth: lbh
 */
public class Client {
    public static void main(String[] args) {
        try {
            Shape shape = ShapeFactory.getInstance("square");
            shape.draw();
            shape.erase();
        } catch (BadShapeException e) {
            e.printStackTrace();
        }
    }
}
