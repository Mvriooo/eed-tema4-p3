package com.proferoman.formas;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;


public class Triangulo extends Poligono implements Forma{
    public Triangulo(Punto p1, Punto p2, Punto p3, Paint color){
        super(p3, null);
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
