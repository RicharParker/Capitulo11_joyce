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
public class UseBook {
    public static void main(String[] args) {
        Fiction libro1 = new Fiction ("El señor de los anillos");
        libro1.display();
        libro1.setPrice();
        System.out.println(libro1.getPrice());
        
        NonFiction libro2 = new NonFiction("Rebelion en la Granja");
        libro2.display();
        libro2.setPrice();
        System.out.println(libro2.getPrice());
        
    }
    
}
