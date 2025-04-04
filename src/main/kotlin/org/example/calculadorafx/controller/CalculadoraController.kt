package org.example.calculadorafx.controller

import javafx.fxml.FXML
import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import javafx.scene.paint.Color

/**
 * @param button0 --> Simula el boton 0 de la calculadora
 * @param button1 --> Simula el boton 1 de la calculadora
 * @param button2 --> Simula el boton 2 de la calculadora
 * @param button3 --> Simula el boton 3 de la calculadora
 * @param button4 --> Simula el boton 4 de la calculadora
 * @param button5 --> Simula el boton 5 de la calculadora
 * @param button6 --> Simula el boton 6 de la calculadora
 * @param button7 --> Simula el boton 7 de la calculadora
 * @param button8 --> Simula el boton 8 de la calculadora
 * @param button9 --> Simula el boton 9 de la calculadora
 * @param buttonReturn --> Simula el boton para borrar un solo valor
 * @param buttonDelete --> Simula el boton C de la calculadora que elimina el contenido
 * @param buttonPlus --> Simula el boton de sumar
 * @param buttonMinus --> Simula el boton de restar
 * @param buttonMulti --> Simula el boton de multiplicacion
 * @param buttonDivide --> Simula el boton de dividir
 * @param buttonEquals --> Simula el boton de igual
 * @param buttonPoint --> Simula el boton del punto de la calculadora para separar cantidades de numeros
 * @param buttonSeparator --> Simula la coma para valores decimales
 * @param input --> Entrada del numero
 */

class CalculadoraController {

    private var operator : String = ""
    private var a : Double = 0.00
    private var b : Double = 0.00

    //Botones de numeros

    @FXML
    lateinit var button0: Button

    @FXML
    lateinit var button1: Button

    @FXML
    lateinit var button2: Button

    @FXML
    lateinit var button3: Button

    @FXML
    lateinit var button4: Button

    @FXML
    lateinit var button5: Button

    @FXML
    lateinit var button6: Button

    @FXML
    lateinit var button7: Button

    @FXML
    lateinit var button8: Button

    @FXML
    lateinit var button9: Button

    //Botones de borrado

    @FXML
    lateinit var buttonReturn: Button

    @FXML
    lateinit var buttonDelete: Button

    //Botones de operacion
    @FXML
    lateinit var buttonPlus: Button

    @FXML
    lateinit var buttonMinus: Button

    @FXML
    lateinit var buttonMulti: Button

    @FXML
    lateinit var buttonPoint: Button

    @FXML
    lateinit var buttonSeparator: Button

    @FXML
    lateinit var buttonDivide: Button

    @FXML
    lateinit var buttonEquals: Button


    //Boton de accion
    @FXML
    private lateinit var input: TextField

    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Bienvenido a la aplicacion de la calculadora!"
    }

    @FXML
    private fun initialize() {
        println("Iniciando la aplicacion...")

    }

    @FXML
    private fun clickButton0() {
        input.text += 0
    }

    @FXML
    private fun clickButton1() {
        input.text += 1
    }

    @FXML
    private fun clickButton2() {
        input.text += 2
    }

    @FXML
    private fun clickButton3() {
        input.text += 3
    }

    @FXML
    private fun clickButton4() {
        input.text += 4
    }

    @FXML
    private fun clickButton5() {
        input.text += 5
    }

    @FXML
    private fun clickButton6() {
        input.text += 6
    }

    @FXML
    private fun clickButton7() {
        input.text += 7
    }

    @FXML
    private fun clickButton8() {
        input.text += 8
    }

    @FXML
    private fun clickButton9() {
        input.text += 9
    }

    @FXML
    private fun clearButton() {

        //Elimina todos los valores puestos en la consola e inicializa a y b con el valor por defecto
        input.text = ""
        a = 0.00
        b = 0.00
        operator = ""
    }

    @FXML
    private fun plusOperator() {

        //Suma a y b
        a = input.text.toDoubleOrNull() ?: 0.00
        operator = "+" //tipo de operador
        input.text += "+" //operador impreso en el TextField
        input.text = ""
    }

    @FXML
    private fun minusOperator() {

        //Resta a y b
        a = input.text.toDoubleOrNull() ?: 0.00
        operator = "-" //tipo de operador
        input.text += "-" //operador impreso en el TextField
        input.text = ""
    }

    @FXML
    private fun multiOperator() {
        //Multiplica a y b
        a = input.text.toDoubleOrNull() ?: 0.00
        operator = "*" //tipo de operador
        input.text += "*" //operador impreso en el TextField
        input.text = ""
    }

    @FXML
    private fun divideOperator() {
        //Divide a y b
        a = input.text.toDoubleOrNull() ?: 0.00
        operator = "/" //tipo de operador
        input.text += "/" //operador impreso en el TextField
        input.text = ""
    }

    @FXML
    private fun equals() {
        b = input.text.toDoubleOrNull() ?: 0.00
        when(operator) {
            "+" -> input.text = (a + b).toString()
            "-" -> input.text = (a - b).toString()
            "*" -> input.text = (a * b).toString()
            "/" -> input.text = (a / b).toString()
        }

    }
}
