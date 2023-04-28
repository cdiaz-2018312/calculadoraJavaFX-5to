package org.in5bm.carlosdiaz.controller;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.in5bm.carlosdiaz.bean.*;
import javax.swing.*;

/**
 * @author carlos diaz
 * @date 25/03/2022 carne: 2018312 codigo tecnico: IN5BM grupo: 1
 *
 */
public class FXMLCalculadoraController implements Initializable {

    private float resultado;
    private float numero;
    private String operadorAnterior;
    private int contador;
    private float resultadoFinal;
    private int punto = 0;
    @FXML
    private Label lblPantalla;

    @FXML
    private Button btnPunto;

    @FXML
    private Button btnIgual;

    @FXML
    private Button btnMasMenos;

    @FXML
    private Button btnCero;

    @FXML
    private Button btnMas;

    @FXML
    private Button btnMenos;

    @FXML
    private Button btnTres;

    @FXML
    private Button btnDos;

    @FXML
    private Button btnUno;

    @FXML
    private Button btnCinco;

    @FXML
    private Button btnCuatro;

    @FXML
    private Button btnSeis;

    @FXML
    private Button btnMult;

    @FXML
    private Button btnNueve;

    @FXML
    private Button btnOcho;

    @FXML
    private Button btnSiete;

    @FXML
    private Button btnDiv;

    @FXML
    private Button btnPorcentaje;

    @FXML
    private Button btnAc;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void cerrar() {
        System.exit(0);
    }

    @FXML
    private void sobre() {
        JOptionPane.showMessageDialog(null, "Desarrollador: Carlos Diaz");

    }

    public void actualizarPantalla(String lol) {
        lblPantalla.setText(lblPantalla.getText().concat(lol));
    }

    private void resetValorResultado() {
        this.resultado = 0;

    }

    @FXML
    private void pressNumero(ActionEvent event) {
        if (event.getSource().equals(btnCero)) {
            actualizarPantalla("0");
        } else if (event.getSource().equals(btnUno)) {
            actualizarPantalla("1");
        } else if (event.getSource().equals(btnDos)) {
            actualizarPantalla("2");
        } else if (event.getSource().equals(btnTres)) {
            actualizarPantalla("3");
        } else if (event.getSource().equals(btnCuatro)) {
            actualizarPantalla("4");
        } else if (event.getSource().equals(btnCinco)) {
            actualizarPantalla("5");
        } else if (event.getSource().equals(btnSeis)) {
            actualizarPantalla("6");
        } else if (event.getSource().equals(btnSiete)) {
            actualizarPantalla("7");
        } else if (event.getSource().equals(btnOcho)) {
            actualizarPantalla("8");
        } else if (event.getSource().equals(btnNueve)) {
            actualizarPantalla("9");
        }
    }

    private void resetValorNumero() {
        this.numero = 0;
    }

    @FXML
    private void pressAc() {
        limpiarPantalla();
        this.resultado = 0;
        this.contador = 0;
        this.numero = 0;
        this.operadorAnterior = "";

    }

    @FXML
    private void pressIgual() {
        calculo(this.operadorAnterior);
        lblPantalla.setText(String.valueOf(this.resultado));
        resultadoFinal = resultado;
    }

    @FXML
    private void pressPunto() {
        punto++;
        if (punto == 1) {
            actualizarPantalla(".");
        } else {
            lblPantalla.getText();
        }
    }

    @FXML
    private void pressMasMenos() {
        resultado = resultado * -1;
        lblPantalla.setText(String.valueOf(resultado));
    }

    @FXML
    private void pressMas() {
        calculo("+");
    }

    @FXML
    private void pressMenos() {
        calculo("-");
    }

    @FXML
    private void pressMult() {
        calculo("*");
    }

    @FXML
    private void pressDiv() {
        calculo("/");
    }

    @FXML
    private void pressPorcentaje() {
        calculo("%");
    }

    private void limpiarPantalla() {
        lblPantalla.setText("");
    }

    private void resetPunto() {
        punto = 0;
    }

    private void calculo(String operador) {

        contador++;
        Operacion calc = null;
        if (contador == 1) {
            resetPunto();
            this.resultado = Float.parseFloat(lblPantalla.getText());
            lblPantalla.setText(String.valueOf(this.resultado));
        } else if (contador >= 2) {
            resetValorNumero();
            resetPunto();
            this.numero = Float.parseFloat(lblPantalla.getText());
            lblPantalla.setText(String.valueOf(this.numero));

            switch (this.operadorAnterior) {
                case "+":
                    limpiarPantalla();
                    calc = new Suma();
                    this.resultado = calc.operar(resultado, numero);
                    break;

                case "-":
                    calc = new Resta();

                    limpiarPantalla();
                    this.resultado = calc.operar(resultado, numero);
                    resultadoFinal = resultado;
                    break;

                case "*":
                    limpiarPantalla();
                    calc = new Multiplicacion();
                    resultado = calc.operar(resultado, numero);

                    break;
                case "/":
                    calc = new Division();
                    resultado = calc.operar(resultado, numero);
                    break;
                case "%":
                    calc = new Porcentaje();
                    resultado = calc.operar(resultado, numero);
                    break;

            }

        }
        this.operadorAnterior = operador;

        limpiarPantalla();

    }
}
