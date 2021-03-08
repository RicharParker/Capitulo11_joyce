/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author ARCHV
 */
public class UseStudent {

    public static void main(String[] args) {
        Student estudiante1 = new FullTime();
        estudiante1.tuition();

        Student estudiante2 = new PartTime();
        estudiante2.tuition();
    }
}
