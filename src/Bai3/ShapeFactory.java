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
public class ShapeFactory {
    public Shape CreateShape(ShapeType Type){
        Shape shape;
        switch (Type){
            case retangle: return shape= Rectangle.CreateRectangle();           
            case triangle: return shape = Triangle.CreateTriangle();
            case circle: return shape = Circle.CreateCricle();
        }
        return null;
    }
}
