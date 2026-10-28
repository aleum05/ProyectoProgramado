/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandra
 */
public class Nutria extends Personaje {
//Representa a la protagonista y administra su vida (corazones).

    public Nutria(String nombre, int corazones) {
        super(nombre, corazones);
    }

    @Override
    public void recibirGolpe() {
        setCorazones(getCorazones() - 1);
    }

    public void reiniciarVida() {
        setCorazones(getCorazonesMaximos());
    }
}
