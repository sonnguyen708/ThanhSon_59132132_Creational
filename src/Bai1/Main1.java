/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Admin
 */
public class Main1 {
    public static void main(String[] args )throws ParseException {
        SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
        HoaDon hoadon;
        hoadon = new HoaDon.HoaDonBuilder()
                .setHeader(new HoaDonHeader("HD01", format.parse("27/03/2020"), "Nguyen Thanh Son"))
                .addDsCTDH( new CTHD ("May tinh de ban",1,15000000,10))
                .addDsCTDH( new CTHD ("Laptop",1,25000000,10))
                .addDsCTDH( new CTHD ("Mouse",1,350000,10))
                .addDsCTDH( new CTHD ("Loa",1,750000,10))
                .addDsCTDH( new CTHD ("Tai phone",1,150000,10))
                .build();
        
        System.out.println(hoadon.toString());                               
    }
}
