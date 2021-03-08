/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author ARCHV
 */
public class  Triangle extends GeometricFigure{

    public Triangle(Integer heigth, Integer width) {
        super(heigth, width, "Triangulo");
    }

    @Override
    public Double setArea() {
    return new Double((getHeigth()*getWidth())/2);  
    }
    
    
    
}
