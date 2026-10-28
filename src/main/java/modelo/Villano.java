/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandra
 */
public class Villano extends Personaje {
//Representa al enemigo que la nutria debe derrotar en cada nivel.

    public Villano(String nombre, int corazones) {
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
