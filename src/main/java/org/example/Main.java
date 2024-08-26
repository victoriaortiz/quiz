package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        List<String> respuestas1= new ArrayList<String>();
        respuestas1.add("negro");
        respuestas1.add("verde");
        respuestas1.add("blanco");
        respuestas1.add("azul");
        pregunta pregunta1=
                new pregunta( "De que color era el caballo blanco de San Martin?",
                        respuestas1,3);
        quiz.agregarPregunta(pregunta1);

        pregunta1.mostrarPregunta();
    }
}
