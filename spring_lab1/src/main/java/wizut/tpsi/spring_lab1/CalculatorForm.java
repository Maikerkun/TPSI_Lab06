/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.spring_lab1;

/**
 *
 * @author dm41347
 */
public class CalculatorForm {
    private Integer x;
    private Integer y;
    private String operacja;
   
    public Integer getX(){
        return x;
    }
    public Integer getY(){
        return y;
    }
    public String getOperacja(){
        return operacja;
    }
    
    public void setX(Integer x){
        this.x = x;
    }
    public void setY(Integer y){
        this.y = y;
    }
    public void setOperacja(String operacja){
        this.operacja = operacja;
    }
}
