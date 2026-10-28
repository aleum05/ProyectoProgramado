/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandra
 */
public class RespuestaJugador {
    //Guarda una pregunta educativa y comprueba si la respuesta del jugador es correcta.
    private int numeroNivel;
    private int numeroPregunta;
    private boolean respuestaSeleccionada;
    private boolean correcta;

    public RespuestaJugador(int numeroNivel,int numeroPregunta,boolean respuestaSeleccionada,boolean correcta) {
        this.numeroNivel = numeroNivel;
        this.numeroPregunta = numeroPregunta;
        this.respuestaSeleccionada = respuestaSeleccionada;
        this.correcta = correcta;
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }

    public int getNumeroPregunta() {
        return numeroPregunta;
    }

    public boolean isRespuestaSeleccionada() {
        return respuestaSeleccionada;
    }

    public boolean isCorrecta() {
        return correcta;
    }
}
