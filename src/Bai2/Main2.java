/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class Main2 {
    public static void main(String[] args) {
        MyStringBuilder str=new MyStringBuilder("Sinh viên")
                .addString("Trường")
                .addString("Đại học Nha Trang")
                .addFloat(2.2f)
                .addBool(true);
                //.build();
          str.addString("bla..bla...");
          System.out.println(str.toString());
          System.out.println(str);
               
    }
    
}
