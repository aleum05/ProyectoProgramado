/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandra
 */
public abstract class Personaje implements Combate{
//Clase abstracta, contiene los datos y comportamientos que comparten la nutria y los villanos.

    private String nombre;
    private int corazones;
    private int corazonesMaximos;

    public Personaje(String nombre, int corazones) {
        this.nombre = nombre;
        this.corazones = corazones;
        this.corazonesMaximos = corazones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCorazones() {
        return corazones;
    }

    public int getCorazonesMaximos() {
        return corazonesMaximos;
    }

    public void setCorazones(int corazones) {
        if (corazones < 0) {
            this.corazones = 0;
        } else if (corazones > corazonesMaximos) {
            this.corazones = corazonesMaximos;
        } else {
            this.corazones = corazones;
        }
    }

    @Override
    public boolean estaDerrotado() {
        return corazones == 0;
    }

    @Override
    public abstract void recibirGolpe();
}
