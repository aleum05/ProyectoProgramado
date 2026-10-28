/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Alejandra
 */
public class Partida {

    /*Es la clase que coordina el estado y las reglas de una partida completa, guarda los cuatro niveles, 
    la nutria y el historial de respuestas, procesa la respuesta y aplica el daño correspondiente, 
    comprueba si el villano fue derrotado, comprueba si la nutria perdió, habilita el siguiente nivel cuando 
    corresponde, establecen el progreso según la opción elegida y comprueba si se completaron los cuatro niveles.*/
    private Nivel[] niveles;
    private Nutria nutria;
    private ArrayList<RespuestaJugador> historialRespuestas;

    public Partida() {
        niveles = new Nivel[4];

        nutria = new Nutria("Nutria", 2);

        historialRespuestas = new ArrayList<>();

        // Aquí se crearán los cuatro niveles.
    }

    public Nivel[] getNiveles() {
        return niveles;
    }

    public Nutria getNutria() {
        return nutria;
    }

    public ArrayList<RespuestaJugador> getHistorialRespuestas() {
        return historialRespuestas;
    }

    public void registrarRespuesta(int numeroNivel,
            int numeroPregunta,
            boolean respuestaSeleccionada,
            boolean correcta) {
        RespuestaJugador registro = new RespuestaJugador(
                numeroNivel,
                numeroPregunta,
                respuestaSeleccionada,
                correcta
        );

        historialRespuestas.add(registro);
    }
}