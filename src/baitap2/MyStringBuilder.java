/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author TrongHanh
 */
public class MyStringBuilder {
    String str;

    public MyStringBuilder(String str) {
        this.str = str;
    }
    
    public MyStringBuilder addString(String s) {
        str = str + s;
        return this;
    }
    
    public MyStringBuilder addFloat(float f) {
        Float ff = f;
        str = str + ff.toString();
        return this;
    }
    
    public MyStringBuilder addBool(boolean b) {
        Boolean bb = b;
        str = str + bb.toString();
        return this;
    }

    @Override
    public String toString() {
        return str;
    }
}
