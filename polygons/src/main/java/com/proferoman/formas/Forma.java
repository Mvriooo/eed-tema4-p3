package com.proferoman.formas;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Paint;



public interface Forma {

    public Shape toShape();
    public double ancho();
    public void mover(int pinxels);
    public Paint repitar(Paint newcolor);
    public void redimensionar(double factor);
} 
