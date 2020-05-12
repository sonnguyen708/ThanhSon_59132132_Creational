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
public class Circle extends Shape{
    private static Shape cricle;
    protected Circle(){
        super("cricle-bush","cricle-paper","cricle-frame");
    };
    public static Shape CreateCricle(){
        if(cricle==null){
            cricle=new Circle();
        }
        return cricle;
    }

    @Override
    public String draw() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return "Draw Cricle:"+getBrush()+","+getPaper()+","+getFrame();
    }       
}
