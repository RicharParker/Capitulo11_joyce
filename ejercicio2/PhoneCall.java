/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author ARCHV
 */
public abstract class PhoneCall {
    protected String number;
    protected Double price;

    public PhoneCall(String number) {
        this.number = number;
        this.price =0.0;
        
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public abstract Double getPrice();
    public abstract String getNumber();
    public abstract String display();
    
    
    
}
