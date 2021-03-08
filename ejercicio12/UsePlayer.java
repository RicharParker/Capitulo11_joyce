/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author ARCHV
 */
public class UsePlayer {

    public static void main(String[] args) {
        Player niño = new Child();
        niño.play();
        
        Player actor = new Actor();
        actor.play();
        
        Player musico = new Musician();
        musico.play();
    }
 
    
}
