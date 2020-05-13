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
public class MainBT2 {
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder("Nguyen Trong").addString(" Hanh").addFloat((float)66.9).addBool(true);
        System.out.println(str.toString());
    }
}
