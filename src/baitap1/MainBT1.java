/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.ArrayList;

/**
 *
 * @author TrongHanh
 */
public class MainBT1 {
    public static void main(String[] args) {
        ArrayList<CTHD> ds = new ArrayList<>();
        ds.add(new CTHD("Banh kep", 2, 10000, 5));
        ds.add(new CTHD("Banh kem", 5, 12000, 5));
        ds.add(new CTHD("Banh it", 6, 16000, 5));
        Header h = new Header("1", "6/6/1999", "Nguyen Trong Hanh");
        HoaDon hd = new HoaDon.Builder().setHeader(h).setDsCTDH(ds).tao();
        System.out.println(hd.toString());
    }
}
