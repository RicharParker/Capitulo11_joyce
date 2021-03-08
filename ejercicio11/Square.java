/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;



/**
 *
 * @author ARCHV
 */
public class Square extends GeometricFigure{

    public Square(Integer heigth, Integer width ) {
        super(heigth, width,"Cuadrado");
    }

    @Override
    public Double setArea() {
        return new  Double(getWidth()*getHeigth());
    }
    
    @Override
    public void displaySides(){
        System.out.println("Esta figura tiene 4 lados");
    }
    
    
    
}
