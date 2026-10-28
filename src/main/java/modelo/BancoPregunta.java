/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandra
 */
public class BancoPregunta {
    //Organiza las siete preguntas mediante un arreglo bidimensional Pregunta[][].
private Pregunta[][] preguntasPorNivel;

    public BancoPregunta() {
        preguntasPorNivel = new Pregunta[4][];

        preguntasPorNivel[0] = new Pregunta[1];
        preguntasPorNivel[1] = new Pregunta[2];
        preguntasPorNivel[2] = new Pregunta[2];
        preguntasPorNivel[3] = new Pregunta[2];

        // Aquí se crearán y asignarán las siete preguntas.
    }

    public Pregunta[] getPreguntasNivel(int nivel) {
        return preguntasPorNivel[nivel];
    }

    public Pregunta getPregunta(int nivel, int indice) {
        return preguntasPorNivel[nivel][indice];
    }
}
