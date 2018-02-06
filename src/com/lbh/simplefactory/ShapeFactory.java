package com.lbh.simplefactory;

/**
 * Created by Advancer on 2018/2/5 16:11.
 * auth: lbh
 */
public class ShapeFactory {

    public static Shape getInstance(String shapeName) throws BadShapeException {
        if (shapeName.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (shapeName.equalsIgnoreCase("square")){
            return new Square();
        }else if (shapeName.equalsIgnoreCase("triangle")){
            return new Triangle();
        }else {
            throw new BadShapeException("error shape");
        }
    }

}
