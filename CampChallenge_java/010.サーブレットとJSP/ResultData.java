/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

//インターフェースの実装
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Akirabear
 */
public class ResultData implements Serializable {
 //フィールドのカプセル化   
    private Date d;
    private String luck;
 //publicで因数のないコンストラクタ   
    public ResultData(){}
 //フィールドはpublicで命名規則に則ったgetter/setterを持つ
    public Date getD(){
        return d;
    }
    
    public void setD(Date d){
        this.d = d;
    }
    
    public String getLuck(){
        return luck;
    }
    
    public void setLuck(String luck){
        this.luck = luck;
    }
}
