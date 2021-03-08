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
public class IncomingPhoneCall extends PhoneCall{

    public IncomingPhoneCall(String number) {
        super(number);
        super.setPrice(0.2);
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
      return " Telefono "+number+" Precio "+getPrice();
    }
    
}
