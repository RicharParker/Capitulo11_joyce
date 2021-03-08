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
public abstract class GeometricFigure extends SidedObject{
    private Integer heigth;
    private Integer width;
    private String typeFigure;
    private final Double area;

    public GeometricFigure(Integer heigth, Integer width, String typeFigure) {
        this.heigth = heigth;
        this.width = width;
        this.typeFigure = typeFigure;
        this.area = setArea();
        
    }
    
       @Override
    public String toString() {
        return "GeometricFigure{" +
                "altura=" + heigth +
                ", ancho=" + width +
                ", tipo='" + typeFigure + '\'' +
                ", area=" + area +
                '}';
    }

    public Integer getHeigth() {
        return heigth;
    }

    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getTypeFigure() {
        return typeFigure;
    }

    public void setTypeFigure(String typeFigure) {
        this.typeFigure = typeFigure;
    }

    public Double getArea() {
        return area;
    }

    public abstract Double setArea();
    
}
