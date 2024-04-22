package com.proferoman;

import com.proferoman.formas.Punto;

import java.util.Random;

import com.proferoman.formas.Circulo;
import com.proferoman.formas.Cuadrado;
import com.proferoman.formas.Forma;
import com.proferoman.formas.Linea;
import com.proferoman.formas.Triangulo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class PrimaryController {

    private Forma forma = null;
    private Paint[] colors = new Paint[]{Color.BLACK, Color.RED, Color.BLUE, Color.RED, Color.BROWN, Color.YELLOW};

    @FXML
    private Pane drawingContainer;

    @FXML
    private HBox operationButtons;

	@FXML
    private HBox optionControls;

    @FXML
    private void showLine() {
        drawingContainer.getChildren().clear();
        optionControls.getChildren().clear();
        operationButtons.setVisible(true);

        forma = new Linea(new Punto(0.0, 0.0), new Punto(100.0, 200.0), Color.RED);
        drawingContainer.getChildren().add(forma.toShape());
    }

    @FXML
    private void showTriangle() {
        drawingContainer.getChildren().clear();
        optionControls.getChildren().clear();
        operationButtons.setVisible(true);

        forma = new Triangulo(new Punto(0.0, 0.0), new Punto(100.0, 200.0), new Punto(200.0, 100.0), Color.RED);
        drawingContainer.getChildren().add(forma.toShape());
    }

    @FXML
    private void showSquare() {
        drawingContainer.getChildren().clear();
        optionControls.getChildren().clear();
        operationButtons.setVisible(true);

        forma = new Cuadrado(new Punto(0.0, 0.0), new Punto(100.0, 0.0), new Punto(100.0, 100.0), new Punto(0.0, 100.0), Color.RED);
        drawingContainer.getChildren().add(forma.toShape());
    }

    @FXML
    private void showCircle() {
        drawingContainer.getChildren().clear();
        optionControls.getChildren().clear();
        operationButtons.setVisible(true);

        forma = new Circulo(new Punto(100.0, 200.0), 100.0, Color.RED);
        drawingContainer.getChildren().add(forma.toShape());
    }

    @FXML
    private void setUpMove() {
		drawingContainer.getChildren().clear();
		optionControls.getChildren().clear();

        Slider slider = new Slider();
		slider.setMin(0);
		slider.setMax(100);
		slider.setValue(0);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.setMajorTickUnit(50);
		slider.setMinorTickCount(5);
		slider.setBlockIncrement(10);
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                move(newValue.doubleValue());
            }
        });

		optionControls.setVisible(true);
		optionControls.getChildren().add(slider);

		drawingContainer.getChildren().add(forma.toShape());
    }

    private void move(double percentage) {
		drawingContainer.getChildren().clear();

        double posX = percentage > 0 ? (percentage / 100.0) * (drawingContainer.getWidth() - forma.ancho()) : 0;

        forma.mover((int)posX);
        drawingContainer.getChildren().add(forma.toShape());
    }

    @FXML
    private void changeColor() {
        drawingContainer.getChildren().clear();

        Random random = new Random();
        forma.repitar(colors[random.nextInt(colors.length - 1)]);
        drawingContainer.getChildren().add(forma.toShape());
    }

    @FXML
    private void setUpResize() {
        drawingContainer.getChildren().clear();
		optionControls.getChildren().clear();

		forma.mover(0);

        Slider slider = new Slider();
		slider.setMin(0);
		slider.setMax(100);
		slider.setValue(0);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.setMajorTickUnit(50);
		slider.setMinorTickCount(5);
		slider.setBlockIncrement(10);
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            double width = forma.ancho();
            
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                resize(width, (newValue.doubleValue() - oldValue.doubleValue()) / 100.0);
            }
        });

		optionControls.setVisible(true);
		optionControls.getChildren().add(slider);

		drawingContainer.getChildren().add(forma.toShape());
    }

    private void resize(double refWidth, double percentage) {
		drawingContainer.getChildren().clear();

		forma.redimensionar(percentage + 1.0);
        drawingContainer.getChildren().add(forma.toShape());
    }
}
