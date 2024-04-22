package com.proferoman.formas;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;

public class Circulo extends FormaColor implements Forma{
    private double radio;
    private Punto centro;

    public Circulo(Punto centro,double radio ,Paint color){
        super(color);
        this.radio = radio;
        this.centro=centro;
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
