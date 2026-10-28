/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandra
 */
public class Pregunta {

    private String enunciado;
    private boolean respuestaCorrecta;
    private String explicacion;

    public Pregunta(String enunciado,boolean respuestaCorrecta,String explicacion) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.explicacion = explicacion;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public boolean getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public boolean verificarRespuesta(boolean respuesta) {
        return respuesta == respuestaCorrecta;
    }
}
