/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import ejercicio10.*;

/**
 *
 * @author ARCHV
 */
public class UseGeometric {
    public static void main(String[] args) {
        GeometricFigure figura1 = new Square(8,2);
        System.out.println(figura1.toString());
        figura1.displaySides();
        GeometricFigure figura2 = new Triangle(4,3);
        System.out.println(figura2.toString());
        figura2.displaySides();
    }
}
