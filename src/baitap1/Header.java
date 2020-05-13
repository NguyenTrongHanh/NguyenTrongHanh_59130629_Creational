/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.text.SimpleDateFormat;

/**
 *
 * @author TrongHanh
 */
public class Header {
    String maHoaDon;
    String ngayBan;
    String tenKhachHang;
    
    public Header(String maHoaDon, String ngayBan, String tenKH) 
    {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKH;
    }

    @Override
    public String toString() {
        return "Header{" + "maHoaDon=" + maHoaDon + ", ngayBan=" + ngayBan + ", tenKhachHang=" + tenKhachHang + '}';
    }

}
