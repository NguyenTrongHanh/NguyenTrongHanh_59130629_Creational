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
public class HoaDon {
    Header header;
    ArrayList<CTHD> dsCTDH;

    protected HoaDon(Builder b) {
        this.header = b.header;
        this.dsCTDH = b.dsCTDH;
    }

    @Override
    public String toString() {
        String chuoi = header.toString();

        for (int i = 0; i < dsCTDH.size(); i++) {
            chuoi += "\n" + dsCTDH.get(i).toString();
        }
        return chuoi;
    }

    public static class Builder {
        Header header;
        ArrayList<CTHD> dsCTDH;

        public Builder setHeader(Header header) {
            this.header = header;
            return this;
        }

        public Builder setDsCTDH(ArrayList<CTHD> dsCTDH) {
            this.dsCTDH = dsCTDH;
            return this;
        }

        public HoaDon tao() {
            return new HoaDon(this);
        } 
        
    }
}
