package com.proferoman.formas;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Line;



public class Linea extends FormaColor implements Forma {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2, Paint color){
        super(color);
    }

    @Override
    public Shape toShape() {
         // TODO Auto-generated method stub
         throw new UnsupportedOperationException("Unimplemented method 'ancho'");
    }

    @Override
    public double ancho() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancho'");
    }

    @Override
    public void mover(int pinxels) {
        
    }

    @Override
    public Paint repitar(Paint newcolor) {
        return newcolor;
    }

    @Override
    public void redimensionar(double factor) {
        
    }

}
