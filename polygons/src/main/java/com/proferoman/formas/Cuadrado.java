package com.proferoman.formas;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;


public class Cuadrado extends Poligono implements Forma{
    public Cuadrado(Punto p1, Punto p2, Punto p3, Punto p4, Paint color){
        super(p4, color);
    }

    @Override
    public Shape toShape() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toShape'");
    }

    @Override
    public double ancho() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancho'");
    }

    @Override
    public void mover(int pinxels) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mover'");
    }

    @Override
    public Paint repitar(Paint newcolor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'repitar'");
    }

    @Override
    public void redimensionar(double factor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'redimensionar'");
    }
}