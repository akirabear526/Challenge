/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author Akirabear
 */
public class challennge23 {
    public class Test {
        public String drink = "";
        public int money = 0;
        public void test1(String a, int b){
            this.drink = a;
            this.money = b;
        }
        public void test2(){
            System.out.print(drink + "の値段は" + money + "円です。");
        }
    }
    public class Check {
        public  void main(String[] args){
            Test product = new Test();
            product.test1 ("お茶",150);
            product.test2 ();
        }
        
    }
}
