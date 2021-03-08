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
public abstract class Book {
    private String name;
    protected Double price;

    public Book(String name) {
    this.name= name;
    this.price= 0.0;
    }
    
    public abstract void setPrice();
    
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
    
    
    
}
