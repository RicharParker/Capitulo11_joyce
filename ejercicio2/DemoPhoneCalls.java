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
public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall entrada = new IncomingPhoneCall(" 94954949 ");
        System.out.println(entrada.display());
        
        OutgoingPhoneCall salida = new OutgoingPhoneCall(" 34234242342 ",3);
        System.out.println(salida.display());
        
    }
}
