/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class HoaDonHeader {
    String MaHD;
    Date Ngayban;
    String TenKH;
    public HoaDonHeader(String MaHD, Date Ngayban, String TenKH)
    {
        this.MaHD = MaHD;
        this.Ngayban = Ngayban;
        this.TenKH = TenKH;
    }
// setter
    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setNgayban(Date Ngayban) {
        this.Ngayban = Ngayban;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader:MaHD"+MaHD
                +"Ngay ban:"+Ngayban+new SimpleDateFormat("dd/MM/yyyy").format(Ngayban)
                +"TenKH :"+TenKH;
    }
    
}
