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
public class Triangle extends Shape{
    private static Shape triangle;
    protected Triangle(){
        super("triangle-brush","triangle-paper","triangle-fram");
    };
    public static Shape CreateTriangle(){
        if(triangle==null){
            triangle=new Triangle();
        }
        return triangle;
    }
    @Override
    public String draw() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return "Draw Triangle:"+getBrush()+","+getPaper()+","+getFrame();            
    }
    
    
}
