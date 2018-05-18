/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Akirabear
 */
abstract class Human {
    //手札
    ArrayList<Integer> myCards = new ArrayList<>();
    //手札の合計値
    abstract public int open ();
    //引いたカードを手札に追加
    abstract public void setCard (ArrayList<Integer> card);
    //hit or stand の判断
    abstract public boolean checkSum ();
}
    
class Dealer extends Human {
        
    //山札
    public ArrayList<Integer> cards = new ArrayList<>();
       
    //cardsの初期設定
    public Dealer(){
        for(int i=1;i<=13;i++){
            if(i>=10){
                cards.add(10);
                cards.add(10);
                cards.add(10);
                cards.add(10);
                continue;
            }
            cards.add(i);
            cards.add(i);
            cards.add(i);               cards.add(i);
            }
        }
        
    //山札から2枚引く
    public ArrayList<Integer> deal (){
        ArrayList<Integer> num = new ArrayList<>();
        Random rand = new Random();
        Integer num1 = rand.nextInt(cards.size());
        num.add(cards.get(num1));
        cards.remove(num1);
        Integer num2 = rand.nextInt(cards.size());
        num.add(cards.get(num2));
        cards.remove(num2);
        return num;
    }
        
    //山札から1枚引く
    public ArrayList<Integer> hit (){
        ArrayList<Integer> num = new ArrayList<>();
        Random rand = new Random();
        Integer num1 = rand.nextInt(cards.size());
        num.add(cards.get(num1));
        cards.remove(num1);
        return num;
    }
        
    //手札の合計値
    public int open() {
        int total = 0;
        for(int value: myCards){
        total = total + value;
        }
        return total;
    }
        
    //引いたカードを手札に追加
    public void setCard (ArrayList<Integer> cards){
        for(Integer value: cards){
            myCards.add(value);
        }
    }
        
    //hit or stand の判断
    public boolean checkSum (){
        if(open() >= 16){
            return false;
        }else{
            return true;
        }
    }
}
    
class User extends Human {
        
    //手札の合計値
    public int open() {
        int total = 0;
        for(int value: myCards){
        total = total + value;
        }
        return total;
    }
        
    //引いたカードを手札に追加
    public void setCard (ArrayList<Integer> cards){
        for(Integer value: cards){
            myCards.add(value);
        }
    }
        
    //hit or stand の判断
    public boolean checkSum (){
        if(open() >= 17){
            return false;
        }else{
            return true;
        }
    }
}
