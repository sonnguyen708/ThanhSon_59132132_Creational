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
public class Rectangle extends Shape{
    private static Shape rectangle;
    protected Rectangle(){
        super("Rectangle-brush","Rectangle-paper","Rectangle-frame");
    }
    public static Shape CreateRectangle(){
        if(rectangle==null){
            rectangle=new Rectangle();
        }
           return rectangle;
    }

    @Override
    public String draw() {
        return "Draw rectangle:"+ getBrush()+","+getPaper()+","+getFrame();
    }
}
