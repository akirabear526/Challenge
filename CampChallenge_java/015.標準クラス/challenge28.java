/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author Akirabear
 */
public class challenge28 {
    public static void main(String[] args){
        Calendar c1 = Calendar.getInstance();
        c1.set(2015, 0, 0, 0, 0, 0);
        Calendar c2 = Calendar.getInstance();
        c2.set(2015, 11, 31, 23, 59, 59);
        Date d1 = c1.getTime();
        Date d2 = c2.getTime();
        System.out.print(d2.getTime() - d1.getTime());
    }
}
