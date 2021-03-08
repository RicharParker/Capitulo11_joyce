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
public class OutgoingPhoneCall extends PhoneCall {
    private Double minutes;

    public OutgoingPhoneCall(String number, Integer minutes) {
        super(number);
        this.minutes = minutes*0.8;
        super.setPrice(this.minutes);
    }
    
    

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String display() {
       return " Telefono "+getNumber()+" Precio "+getPrice();
    }
    
}
