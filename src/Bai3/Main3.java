/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class Main3 {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactory();
        Shape shapeRect= shapeFactory.CreateShape(ShapeType.retangle);
        Shape shapeCir= shapeFactory.CreateShape(ShapeType.circle);
        Shape shapeTri= shapeFactory.CreateShape(ShapeType.triangle);
        System.out.println(shapeRect.draw());
        System.out.println(shapeCir.draw());
        System.out.println(shapeTri.draw());
    }
}
