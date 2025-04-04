package org.example.calculadorafx

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.Background
import javafx.scene.paint.Color
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("views/calculadora-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }

    override fun stop() {
        println("Saliendo de la aplicacion")
    }

    override fun init() {
        println("Iniciando la calculadora")
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}