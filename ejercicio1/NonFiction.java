/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author ARCHV
 */
public class NonFiction extends Book{

    public NonFiction(String name) {
        super(name);
        setPrice();
    }
    
    @Override
    public void setPrice() {
       price = 37.99;
    }
    
    public void display(){
        System.out.println("Nombre del libro: "+getName()+ "El precio: "+getPrice());
    }
}
